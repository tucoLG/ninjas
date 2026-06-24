package br.com.etec.ninjas.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etec.ninjas.model.Missao;



public interface MissaoRepository extends JpaRepository<Missao, Long> {
    Missao findByNomeMissao(String nome_missao);
    Missao findByDificuldade(String dificuldade);

    
}
