package com.thaua.biblioteca.biblioteca.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Entity
@Table(name = "categoriass_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "categoria_id")
    private UUID id;

    private String nome;

    private String descricao;
}
