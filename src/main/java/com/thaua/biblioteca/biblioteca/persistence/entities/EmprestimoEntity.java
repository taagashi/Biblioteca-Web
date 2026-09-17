package com.thaua.biblioteca.biblioteca.persistence.entities;

import com.thaua.biblioteca.biblioteca.domain.EmprestimoStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Builder
@Table(name = "emprestimos_tb")
@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "emprestimo_id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @Builder.Default
    @CreationTimestamp
    @Column(name = "data_emprestimo")
    private LocalDateTime dataEmprestimo = LocalDateTime.now();

    @Column(name = "data_devolucao_prevista")
    private LocalDateTime dataDevolucaoPrevista;

    @Column(name = "data_devolucao_efetiva")
    private LocalDateTime dataDevolucaoEfetiva;

    @Enumerated(EnumType.STRING)
    private EmprestimoStatus status;

    @Column(name = "valor_multa")
    BigDecimal valorMulta;

    @ManyToMany
    @JoinTable(
            name = "item_emprestimo",
            joinColumns = @JoinColumn(name = "emprestimo_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private Set<LivroEntity> livros;
}
