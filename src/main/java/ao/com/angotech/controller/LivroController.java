package ao.com.angotech.controller;

import ao.com.angotech.dto.LivroCreateDTO;
import ao.com.angotech.dto.LivroResponseDTO;
import ao.com.angotech.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/livros")
public class LivroController {


    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroResponseDTO> save(@Valid @RequestBody LivroCreateDTO dto) {

        LivroResponseDTO livro = livroService.cadastrarLivros(dto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(livro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroResponseDTO> getLivro(@PathVariable Long id) {

        LivroResponseDTO livro = livroService.buscarLivro(id);

        return ResponseEntity.status(HttpStatus.OK)
                .body(livro);
    }

    @GetMapping
    public ResponseEntity<Page<LivroResponseDTO>> buscarTodos(
            @RequestParam(required = false) String titulo,
            @RequestParam(required = false) String autor,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "titulo") String sortBy,
            @RequestParam(defaultValue = "asc") String direction) {

        Page<LivroResponseDTO> livros = livroService.buscarTodosOsLivros(titulo, autor, page, size, sortBy, direction);
        return ResponseEntity.ok(livros);
    }
}
