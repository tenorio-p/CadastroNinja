package com.java10x.CadastroDeNinjas.Missoes;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private final MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }


    // Listar missoes
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    //Listar por Id
    public MissoesModel listarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesModelOptional = missoesRepository.findById(id);
        return missoesModelOptional.orElse(null);
    }

    // Criar missao
    public MissoesModel criarMissao(MissoesModel missao) {
        return missoesRepository.save(missao);
    }


    // Alterar missao
    public MissoesModel atualizarMissao(Long id, MissoesModel missaoAtualizada) {
        if (missoesRepository.existsById(id)) {
            missaoAtualizada.setId(id);
            return missoesRepository.save(missaoAtualizada);
        }
        return null;
    }

    // Deletar missao
    public void deletarMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }

}
