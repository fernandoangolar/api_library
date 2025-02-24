package ao.com.angotech.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EmprestimoCreateDTO(

        @NotNull(message = "O ID do usuário é obrigatório")
        Long usuarioId,

        @NotNull(message = "O ID do livro é obrigatório")
        Long livroId,

        @NotNull(message = "A data de empréstimo é obrigatória")
        LocalDate dataEmprestimo,

        Boolean devolvido,

        @NotNull(message = "A data de devolucão é obrigatória")
        LocalDate dataDevolucao
) {
}
