package com.thaua.biblioteca.biblioteca.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Builder
@Entity
@Table(name = "livros_tb")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "livro_id")
    private UUID id;

    @Column(length = 13)
    private Long isbn;

    private String editora;

    @Column(name = "numero_paginas")
    private Integer numeroPaginas;

    @Column(name = "quantidade_total")
    private Integer quantidadeTotal;

    @Column(name = "quantidade_disponivel")
    private Integer quantidadeDisponivel;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;
}
