package br.com.treinaweb.hyperprof.core.models;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;


@Entity
@Table(name="professores")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@ToString(onlyExplicitlyIncluded = true)

public class Professor extends Auditable {

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

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor_hora")
    private BigDecimal valorHora;

    @Column(name = "foto_perfil")
    private String fotoPerfil;

    @Column(name = "password")
    private String password;

}
