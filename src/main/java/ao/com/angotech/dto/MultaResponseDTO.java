package ao.com.angotech.dto;

import java.math.BigDecimal;

public record MultaResponseDTO(

        Long id,
        Long emprestimoId,
        BigDecimal valor,
        Boolean paga
) {
}
