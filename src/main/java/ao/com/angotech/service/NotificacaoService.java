package ao.com.angotech.service;

import ao.com.angotech.dto.EnviarNotificacaoDTO;
import ao.com.angotech.dto.NotificacaoResponseDTO;

import java.util.List;

public interface NotificacaoService {

    NotificacaoResponseDTO enviarNotificacao(EnviarNotificacaoDTO dto);
    List<NotificacaoResponseDTO> listarNotificacoesPorUsuario(Long usuarioId);
}
