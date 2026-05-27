package br.com.etec.ninjas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.etec.ninjas.model.Ninja;
import br.com.etec.ninjas.repository.NinjaRepository;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public Ninja cadastrarNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
        //método cadastar ninja usando o método save do ninjaRepository para salvar o ninja no banco de dados e retorna o ninja cadastrado. 
    }
}
