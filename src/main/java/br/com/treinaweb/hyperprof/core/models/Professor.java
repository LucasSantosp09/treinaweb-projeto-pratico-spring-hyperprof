package br.com.treinaweb.hyperprof.core.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="professores")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Professor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @ToString.Include
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    @ToString.Include
    private String email;

    @Column(name = "idade")
    private int idade;

    @Column(name = "desscricao")
    private String descricao;

    @Column(name = "valor_hora")
    private BigDecimal valorHora;

    @Column(name = "foto_perfil")
    private String fotoPerfil;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
