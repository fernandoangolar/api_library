package ao.com.angotech.service.impl;

import ao.com.angotech.dto.LivroCreateDTO;
import ao.com.angotech.dto.LivroResponseDTO;
import ao.com.angotech.dto.LivroUpdateDTO;
import ao.com.angotech.exception.BusinessException;
import ao.com.angotech.exception.ResourceEntityNotFound;
import ao.com.angotech.model.Livro;
import ao.com.angotech.repository.LivroRespository;
import ao.com.angotech.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRespository livroRespository;

    @Override
    public LivroResponseDTO cadastrarLivros(LivroCreateDTO dto) {

        if ( livroRespository.findByisbn(dto.isbn()).isPresent() ) {
            throw new BusinessException("Já existe um livro cadastra com este ISBN");
        }

        Livro livro = new Livro();
        livro.setTitulo(dto.titulo());
        livro.setAutor(dto.autor());
        livro.setIsbn(dto.isbn());
        livro.setGenero(dto.genero());
        livro.setEditora(dto.editora());
        livro.setQuantidadeDisponivel(dto.quantidadeDisponivel());
        livro.setAnoPublicacao(dto.anoPublicacao());

        livroRespository.save(livro);

        return new LivroResponseDTO(
                livro.getId(),
                livro.getTitulo(),
                livro.getAutor(),
                livro.getIsbn(),
                livro.getEditora(),
                livro.getGenero(),
                livro.getAnoPublicacao(),
                livro.getQuantidadeDisponivel()
        );

    }

    @Override
    public LivroResponseDTO atualizarLivros(Long id, LivroUpdateDTO dto) {
        return null;
    }

    @Override
    public LivroResponseDTO buscarLivro(Long id) {

        Livro livro = livroRespository.findById(id)
                .orElseThrow( () -> new ResourceEntityNotFound("Livro com este id não encontrado") );

        return new LivroResponseDTO(
                livro.getId(),
                livro.getTitulo(),
                livro.getAutor(),
                livro.getIsbn(),
                livro.getEditora(),
                livro.getGenero(),
                livro.getAnoPublicacao(),
                livro.getQuantidadeDisponivel()
        );
    }

    @Override
    public Page<LivroResponseDTO> buscarTodosOsLivros(String titulo, String autor, int page, int size, String sortBy, String direction) {

        Sort sort = Sort.by(Sort.Direction.fromString(direction), sortBy);
        Pageable pageable = PageRequest.of(page, size, sort);

        Page<Livro> livros = (titulo != null && autor != null) ?
                livroRespository.findByTituloContainingIgnoreCaseAndAutorContainingIgnoreCase(titulo, autor, pageable) :
                (titulo != null) ? livroRespository.findByTituloContainingIgnoreCase(titulo, pageable) :
                        (autor != null) ? livroRespository.findByAutorContainingIgnoreCase(autor, pageable) :
                                livroRespository.findAll(pageable);

        return livros.map(LivroResponseDTO::fromEntity);
    }


    @Override
    public void excluirLivro(Long id) {

    }
}
