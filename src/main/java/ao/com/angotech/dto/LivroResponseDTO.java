package ao.com.angotech.dto;

import ao.com.angotech.model.Livro;

public record LivroResponseDTO(

        Long id,
        String titulo,
        String autor,
        String isbn,
        String editora,
        String genero,
        Integer anoPublicacao,
        Integer quantidadeDisponivel
) {

    public static LivroResponseDTO fromEntity(Livro livro) {
        return new LivroResponseDTO(livro.getId(), livro.getTitulo(), livro.getAutor(), livro.getIsbn(),
                livro.getEditora(), livro.getGenero(), livro.getAnoPublicacao(), livro.getQuantidadeDisponivel());
    }
}
