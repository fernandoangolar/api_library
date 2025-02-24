package ao.com.angotech.dto;

import java.time.LocalDate;

public record ReservaResponseDTO(

        Long id,
        Long usuarioId,
        Long livroId,
        LocalDate dataReserva,
        Boolean ativa
) {
}
