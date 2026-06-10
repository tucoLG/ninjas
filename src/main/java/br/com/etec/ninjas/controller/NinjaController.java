package br.com.etec.ninjas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etec.ninjas.model.Ninja;
import br.com.etec.ninjas.service.NinjaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @PostMapping
    public Ninja cadastrarNinja (@Valid @RequestBody Ninja ninja) {
        return ninjaService.cadastrarNinja(ninja);
        //método cadastrar ninja usando a anotação @PostMapping para mapear a requisição POST, recebe um objeto Ninja no corpo da requisição e chama o método cadastrarNinja do ninjaService para cadastrar o ninja e retorna o ninja cadastrado, com validação e refinamento.
    }

    @GetMapping
    public List<Ninja> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    @GetMapping ("/id/{id}")
    public Optional<Ninja> pesquisarNinja (@PathVariable Long id) {
        return ninjaService.pesquisarNinja(id);
    }

    @GetMapping ("/nome_completo/{nome}")
    public Ninja pesquisarNomeNinja (@PathVariable String nome) {
        return ninjaService.pesquisarNomeNinja(nome);
    }

    @GetMapping ("/nome/{nome}")
    public List<Ninja> pesquisarPorParteDoNome (@PathVariable String nome) {
        return ninjaService.pesquisarNinjaPorParteDoNome(nome);
    }
    }

    

