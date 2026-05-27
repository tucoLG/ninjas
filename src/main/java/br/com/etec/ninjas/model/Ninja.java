package br.com.etec.ninjas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table (name = "ninja")
@Data
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ninja;

    @Column(name = "nome_ninja", nullable = false)
    private String nome;

    @Column(name = "cpf_ninja", nullable = false, unique = true)
    private String cpf;

    @Column(name = "email_ninja", nullable = false, unique = true)
    private String email;
    
}
