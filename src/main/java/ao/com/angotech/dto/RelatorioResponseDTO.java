package ao.com.angotech.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record RelatorioResponseDTO(

        Long id,

        @Pattern(regexp = "LIVROS_MAIS_EMPRESTADOS|USUARIOS_MAIS_EMPRESTADOS",
                message = "O tipo de relatório deve ser LIVROS_MAIS_EMPRESTADOS ou USUARIOS_MAIS_EMPRESTADOS")
        String tipo,

        LocalDate dataGeracao,

        @NotBlank(message = "Os dados do relatório são obrigatórios")
        String dados
) {
}
