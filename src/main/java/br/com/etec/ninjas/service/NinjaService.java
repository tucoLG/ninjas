package br.com.etec.ninjas.service;

import java.util.List;
import java.util.Optional;

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

    public Optional<Ninja> pesquisarNinja (Long id) {
        return ninjaRepository.findById(id);
    }

    public Ninja pesquisarNomeNinja (String nome) {
        return ninjaRepository.findByNome(nome);
    }

    public List<Ninja> pesquisarNinjaPorParteDoNome (String nome) {
        return ninjaRepository.findByNomeContaining(nome);
    }

    public Ninja atualizarNinja (Long id, Ninja ninjaAtualizado) {
        Optional<Ninja> ninjaCadastrado = ninjaRepository.findById(id);
        
        if(ninjaCadastrado.isPresent()) {
          Ninja ninja = ninjaCadastrado.get();
          
          ninja.setNome(ninjaAtualizado.getNome());
          ninja.setCpf(ninjaAtualizado.getCpf());
          ninja.setEmail(ninjaAtualizado.getEmail());

          return ninjaRepository.save(ninja);
        }
    return null;    
   }

   public void deletarNinja (Long id) {
    ninjaRepository.deleteById(id);
   }
}
