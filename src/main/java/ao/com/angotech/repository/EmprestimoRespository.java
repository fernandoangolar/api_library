package ao.com.angotech.repository;


import ao.com.angotech.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRespository extends JpaRepository<Emprestimo, Long> {
}
