package ao.com.angotech.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record EmprestimoUpdateDTO(

        @NotNull(message = "A data de devolução é obrigatória")
        LocalDate dataDevolucao,

        Boolean devolvido,

        @NotNull(message = "O status é obrigatório")
        @Pattern(regexp = "ATIVO|DEVOLVIDO|ATRASADO", message = "O status deve ser ATIVO, DEVOLVIDO ou ATRASADO")
        String status
) {
}
