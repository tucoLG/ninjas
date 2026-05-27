package br.com.etec.ninjas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etec.ninjas.model.Ninja;
import br.com.etec.ninjas.service.NinjaService;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @PostMapping
    public Ninja cadastrarNinja (@RequestBody Ninja ninja) {
        return ninjaService.cadastrarNinja(ninja);
        //método cadastrar ninja usando a anotação @PostMapping para mapear a requisição POST, recebe um objeto Ninja no corpo da requisição e chama o método cadastrarNinja do ninjaService para cadastrar o ninja e retorna o ninja cadastrado.
    }

    
}
