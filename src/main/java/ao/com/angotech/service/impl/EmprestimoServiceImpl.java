package ao.com.angotech.service.impl;

import ao.com.angotech.dto.EmprestimoCreateDTO;
import ao.com.angotech.dto.EmprestimoResponseDTO;
import ao.com.angotech.service.EmprestimoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {

    @Override
    public EmprestimoResponseDTO realizarEmprestimo(EmprestimoCreateDTO dto) {
        return null;
    }

    @Override
    public EmprestimoResponseDTO resistarDevolucao(Long id) {
        return null;
    }

    @Override
    public List<EmprestimoResponseDTO> listarEmprestimosAtivo() {
        return null;
    }
}
