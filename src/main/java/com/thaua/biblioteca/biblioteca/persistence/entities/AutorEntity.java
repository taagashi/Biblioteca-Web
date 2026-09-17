package com.thaua.biblioteca.biblioteca.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Builder
@Entity
@Table(name = "autores_tb")
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "usuario_id")
@AllArgsConstructor
@NoArgsConstructor
public class AutorEntity extends UsuarioEntity{
    @Column(name = "dat_nascimento")
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "nacionalidade_id")
    private NacionalidadeEntity nacionalidade;

    private String biografia;

    @ManyToMany
    @JoinTable(
            name = "autores_livros_tb",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private Set<LivroEntity> livros;
}
