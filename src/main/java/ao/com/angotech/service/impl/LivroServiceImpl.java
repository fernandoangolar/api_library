package ao.com.angotech.service.impl;

import ao.com.angotech.dto.LivroCreateDTO;
import ao.com.angotech.dto.LivroResponseDTO;
import ao.com.angotech.dto.LivroUpdateDTO;
import ao.com.angotech.service.LivroService;
import org.springframework.stereotype.Service;

@Service
public class LivroServiceImpl implements LivroService {

    @Override
    public LivroResponseDTO cadastrarLivros(LivroCreateDTO dto) {
        return null;
    }

    @Override
    public LivroResponseDTO atualizarLivros(Long id, LivroUpdateDTO dto) {
        return null;
    }

    @Override
    public LivroResponseDTO buscarLivro(Long id) {
        return null;
    }

    @Override
    public LivroResponseDTO buscarTodosOsLivros() {
        return null;
    }

    @Override
    public void excluirLivro(Long id) {

    }
}
