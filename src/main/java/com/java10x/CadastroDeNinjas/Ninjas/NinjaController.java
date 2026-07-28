package com.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Olá mundo! Sejam bem vindos.";
    }

    // Adicionar Ninja
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado com sucesso!";
    }


    // Mostrar todos os ninjas
    @GetMapping("/listar")
    public String mostrarNinjas(){
        return "Todos os ninjas cadastrados.";
    }

    // Mostrar ninja por id
    @GetMapping("/listarID")
    public String mostrarNinjaPorId(){
        return "Ninja por id";
    }

    // Alterar dados do ninja
    @PutMapping("/alterarID")
    public String alterarNinja(){
        return "Ninja com ID atualizado.";
    }

    // Deletar ninja
    @DeleteMapping("/deletarID")
    public String deletarNinja(){
        return "Ninja com ID deletado.";
    }

}
