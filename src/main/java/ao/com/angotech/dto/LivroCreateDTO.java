package ao.com.angotech.dto;

import jakarta.validation.constraints.*;

public record LivroCreateDTO(

        @NotBlank(message = "O título é obrigatório")
        @Size(max = 200, message = "O título deve ter no máximo 200 caracteres")
        String titulo,

        @NotBlank(message = "O autor é obrigatório")
        @Size(max = 100, message = "O autor deve ter no máximo 100 caracteres")
        String autor,

        @NotBlank(message = "O ISBN é obrigatório")
        @Size(max = 20, message = "O ISBN deve ter no máximo 20 caracteres")
        String isbn,

        @NotBlank(message = "A editora é obrigatória")
        @Size(max = 100, message = "A editora deve ter no máximo 100 caracteres")
        String editora,

        @NotBlank(message = "O gênero é obrigatório")
        @Size(max = 50, message = "O gênero deve ter no máximo 50 caracteres")
        String genero,

        @NotNull(message = "O ano de publicação é obrigatório")
        @Min(value = 1500, message = "O ano de publicação deve ser maior ou igual a 1500")
        @Max(value = 2023, message = "O ano de publicação não pode ser no futuro")
        Integer anoPublicacao,

        @NotNull(message = "A quantidade disponível é obrigatória")
        @Min(value = 0, message = "A quantidade disponível não pode ser negativa")
        Integer quantidadeDisponivel
) {
}
