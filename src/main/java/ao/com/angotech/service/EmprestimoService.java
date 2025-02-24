package ao.com.angotech.service;

import ao.com.angotech.dto.EmprestimoCreateDTO;
import ao.com.angotech.dto.EmprestimoResponseDTO;

import java.util.List;

public interface EmprestimoService {

    EmprestimoResponseDTO realizarEmprestimo(EmprestimoCreateDTO dto);
    EmprestimoResponseDTO resistarDevolucao(Long id);
    List<EmprestimoResponseDTO> listarEmprestimosAtivo();
}
