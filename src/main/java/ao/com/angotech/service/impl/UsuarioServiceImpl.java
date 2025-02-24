package ao.com.angotech.service.impl;

import ao.com.angotech.dto.UsuarioCreateDTO;
import ao.com.angotech.dto.UsuarioResponseDTO;
import ao.com.angotech.dto.UsuarioUpdateDTO;
import ao.com.angotech.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Override
    public UsuarioResponseDTO cadastrarUsuario(UsuarioCreateDTO dto) {
        return null;
    }

    @Override
    public UsuarioResponseDTO atualizarUsuario(Long id, UsuarioUpdateDTO dto) {
        return null;
    }

    @Override
    public UsuarioResponseDTO buscarUsuario(Long id) {
        return null;
    }

    @Override
    public List<UsuarioResponseDTO> buscarTodosUsuarios() {
        return null;
    }

    @Override
    public void excluirUsuario(Long id) {

    }
}
