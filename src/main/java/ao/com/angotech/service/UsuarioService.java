package ao.com.angotech.service;

import ao.com.angotech.dto.UsuarioCreateDTO;
import ao.com.angotech.dto.UsuarioResponseDTO;
import ao.com.angotech.dto.UsuarioUpdateDTO;

import java.util.List;

public interface UsuarioService {

    UsuarioResponseDTO cadastrarUsuario(UsuarioCreateDTO dto);
    UsuarioResponseDTO atualizarUsuario(Long id, UsuarioUpdateDTO dto);
    UsuarioResponseDTO buscarUsuario(Long id);
    List<UsuarioResponseDTO> buscarTodosUsuarios();
    void excluirUsuario(Long id);
}
