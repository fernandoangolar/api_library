package ao.com.angotech.service.impl;

import ao.com.angotech.dto.ReservaCreateDTO;
import ao.com.angotech.dto.ReservaResponseDTO;
import ao.com.angotech.service.ReservaService;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Override
    public ReservaResponseDTO reservarLivro(ReservaCreateDTO dto) {
        return null;
    }

    @Override
    public void cancelarReserva(Long reservaId) {

    }
}
