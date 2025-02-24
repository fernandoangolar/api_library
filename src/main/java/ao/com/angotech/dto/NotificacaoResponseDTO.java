package ao.com.angotech.dto;

import java.time.LocalDateTime;

public record NotificacaoResponseDTO(

        Long id,
        Long usuarioId,
        String mensagem,
        LocalDateTime dataEnvio
) {
}
