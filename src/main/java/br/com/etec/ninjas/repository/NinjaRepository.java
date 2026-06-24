package br.com.etec.ninjas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etec.ninjas.model.Ninja;



public interface NinjaRepository extends JpaRepository<Ninja, Long>{
    
    Ninja findByNome(String nome);
    List<Ninja> findByNomeContaining(String nome);

    
}
