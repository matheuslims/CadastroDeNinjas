package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

// Entity ele transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    // @ManyToOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key -> chave estrangeira
    private MissoesModel missoes;

}
