package com.thaua.biblioteca.biblioteca.persistence.entities;


import com.thaua.biblioteca.biblioteca.domain.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Entity
@Table(name = "usuarios_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "usuario_id")
    private UUID id;

    private String email;

    private String nome;

    private String cpf;

    private String telefone;

    private String endereco;

    @Builder.Default
    private Boolean ativo = true;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private Role role = Role.USUARIO_COMUM;

    @Builder.Default
    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro = LocalDateTime.now();
}
