package ao.com.angotech.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "livros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String autor;

    @Column(nullable = false, unique = true, length = 20)
    private String isbn;

    @Column(nullable = false, length = 100)
    private String editora;


    @Column(nullable = false, length = 50)
    private String genero;

    @Column(nullable = false, name = "ano_publicacao")
    private Integer anoPublicacao;

    @Column(nullable = false, name = "quantidade_disponivel")
    private Integer quantidadeDisponivel;
}
