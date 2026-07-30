package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar ninja por ID
    public NinjaModel listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaOptional = ninjaRepository.findById(id);
        return ninjaOptional.orElse(null);
    }

    // Criar um novo ninja
    public NinjaDTO criarNinja(NinjaDTO ninja) {
        NinjaModel ninjaModel = ninjaMapper.map(ninja);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }


    // Atualizar Ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if(ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
            return null;
    }


    // Deletar o ninja
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

}
