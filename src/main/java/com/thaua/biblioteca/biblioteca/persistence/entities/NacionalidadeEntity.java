package com.thaua.biblioteca.biblioteca.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@Entity
@Table(name = "nacionalidades_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NacionalidadeEntity {
    @Id
    String nome;
}
