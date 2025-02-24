package ao.com.angotech.service;

import ao.com.angotech.dto.MultaResponseDTO;

import java.math.BigDecimal;

public interface MultaService {

    MultaResponseDTO aplicarMulta(Long emprestimoId, BigDecimal valor);
    MultaResponseDTO pagarMulta(Long multaId);
}
