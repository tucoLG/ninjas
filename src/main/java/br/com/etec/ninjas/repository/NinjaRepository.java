package br.com.etec.ninjas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etec.ninjas.model.Ninja;

public interface NinjaRepository extends JpaRepository<Ninja, Long>{
    
}
