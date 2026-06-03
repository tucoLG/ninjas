package br.com.etec.ninjas.model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Data;


@Entity
@Table (name = "ninja")
@Data
@Valid
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ninja;

    @Column(name = "nome_ninja", nullable = false)
    @NotBlank(message = "O nome do ninja é obrigatório")
    @Size(min = 3, max = 255, message = "O nome do ninja deve conter entre 3 e 255 caracteres")
    private String nome;

    @Column(name = "cpf_ninja", nullable = false, unique = true)
    @CPF(message = "Insira um CPF válido")
    private String cpf;

    @Column(name = "email_ninja", nullable = false, unique = true)
    @Email(message = "Insira um email válido")
    private String email;
    
}
