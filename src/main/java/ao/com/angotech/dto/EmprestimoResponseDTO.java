package ao.com.angotech.dto;

import java.time.LocalDate;

public record EmprestimoResponseDTO(

        Long id,
        Long usuarioId,
        Long livroId,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,

        Boolean devolvido,
        String status
) {
}
