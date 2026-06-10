package br.com.etec.ninjas.service;

import java.util.List;

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
        //método cadastrar ninja usando o método save do ninjaRepository para salvar o ninja no banco de dados e retorna o ninja cadastrado. 
    }
    public List<Ninja> listarNinjas() {
        return ninjaRepository.findAll();
    }
}
