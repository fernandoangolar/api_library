package ao.com.angotech.service;

import ao.com.angotech.dto.LivroCreateDTO;
import ao.com.angotech.dto.LivroResponseDTO;
import ao.com.angotech.dto.LivroUpdateDTO;
import org.springframework.data.domain.Page;

public interface LivroService {

    LivroResponseDTO cadastrarLivros(LivroCreateDTO dto);
    LivroResponseDTO atualizarLivros(Long id, LivroUpdateDTO dto);
    LivroResponseDTO buscarLivro(Long id);
    Page<LivroResponseDTO> buscarTodosOsLivros(String titulo, String autor, int page, int size, String sortBy, String direction);
    void excluirLivro(Long id);
}
