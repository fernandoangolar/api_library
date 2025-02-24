package ao.com.angotech.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ReservaCreateDTO(

        @NotNull(message = "O ID do usuário é obrigatório")
        Long usuarioId,

        @NotNull(message = "O ID do livro é obrigatório")
        Long livroId,

        @NotNull(message = "A data de reserva é obrigatória")
        LocalDate dataReserva,

        Boolean ativa
) {
}
