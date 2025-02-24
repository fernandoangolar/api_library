package ao.com.angotech.service;

import ao.com.angotech.dto.LivroCreateDTO;
import ao.com.angotech.dto.LivroResponseDTO;
import ao.com.angotech.dto.LivroUpdateDTO;

public interface LivroService {

    LivroResponseDTO cadastrarLivros(LivroCreateDTO dto);
    LivroResponseDTO atualizarLivros(Long id, LivroUpdateDTO dto);
    LivroResponseDTO buscarLivro(Long id);
    LivroResponseDTO buscarTodosOsLivros();
    void excluirLivro(Long id);
}
