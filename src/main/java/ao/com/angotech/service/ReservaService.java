package ao.com.angotech.service;

import ao.com.angotech.dto.ReservaCreateDTO;
import ao.com.angotech.dto.ReservaResponseDTO;

public interface ReservaService {

    ReservaResponseDTO reservarLivro(ReservaCreateDTO dto);
    void cancelarReserva(Long reservaId);
}
