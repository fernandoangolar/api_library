package ao.com.angotech.repository;

import ao.com.angotech.model.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LivroRespository extends JpaRepository<Livro, Long> {

    Optional<Livro> findByisbn(String isbn);

    Page<Livro> findByTituloContainingIgnoreCase(String titulo, Pageable pageable);

    Page<Livro> findByAutorContainingIgnoreCase(String autor, Pageable pageable);

    Page<Livro> findByTituloContainingIgnoreCaseAndAutorContainingIgnoreCase(String titulo, String autor, Pageable pageable);
}
