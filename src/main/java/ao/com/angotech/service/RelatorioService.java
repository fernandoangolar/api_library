package ao.com.angotech.service;

import ao.com.angotech.dto.RelatorioResponseDTO;

public interface RelatorioService {

    RelatorioResponseDTO gerarRelatorioLivrosMaisEmprestados();
    RelatorioResponseDTO gerarRelatorioUsuariosComMaisEmprestimos();
}
