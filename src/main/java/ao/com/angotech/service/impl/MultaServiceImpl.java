package ao.com.angotech.service.impl;

import ao.com.angotech.dto.MultaResponseDTO;
import ao.com.angotech.service.MultaService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class MultaServiceImpl implements MultaService {

    @Override
    public MultaResponseDTO aplicarMulta(Long emprestimoId, BigDecimal valor) {
        return null;
    }

    @Override
    public MultaResponseDTO pagarMulta(Long multaId) {
        return null;
    }
}
