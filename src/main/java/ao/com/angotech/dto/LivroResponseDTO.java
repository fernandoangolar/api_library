package ao.com.angotech.dto;

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
}
