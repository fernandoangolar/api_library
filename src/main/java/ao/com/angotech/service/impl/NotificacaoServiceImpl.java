package ao.com.angotech.service.impl;

import ao.com.angotech.dto.EnviarNotificacaoDTO;
import ao.com.angotech.dto.NotificacaoResponseDTO;
import ao.com.angotech.service.NotificacaoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacaoServiceImpl implements NotificacaoService {

    @Override
    public NotificacaoResponseDTO enviarNotificacao(EnviarNotificacaoDTO dto) {
        return null;
    }

    @Override
    public List<NotificacaoResponseDTO> listarNotificacoesPorUsuario(Long usuarioId) {
        return null;
    }
}
