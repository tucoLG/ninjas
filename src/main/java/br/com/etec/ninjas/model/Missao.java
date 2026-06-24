package br.com.etec.ninjas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table (name = "missao")
@Data
@Valid
public class Missao {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id_missao;

    @Column(name = "nome_missao", nullable = false)
    @Size(min = 5, max = 20, message = "O nome da missão deve conter entre 5 e 20 caracteres")
    private String nomeMissao;

    @Column (name = "descricao_missao", nullable = false)
    @Size(min = 10, max = 200, message = "A descrição da missão deve conter entre 10 e 200 caracteres")
    private String descricao;

    @Column (name = "dificuldade_missao", nullable = false)
    @Size(min = 1, max = 10, message = "A dificuldade da missão deve conter entre 1 e 10 caracteres")
    private String dificuldade;

}
