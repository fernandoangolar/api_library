package ao.com.angotech.model;

import ao.com.angotech.enuns.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "relatorios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 100)
    private Tipo tipo;

    @Column(nullable = false)
    private LocalDate dataGeracao;

    @Column(nullable = false, columnDefinition = "json")
    private String dados; // JSON armazenado como String
}
