package com.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // Mostrar as missoes
    @GetMapping("/mostrar")
    public String listarMissoes(){
        return "Lista de missoes";
    }
    // Criar uma missao
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada";
    }
    // Alterar uma missao
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada";
    }
    // Deletar uma missao
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada";
    }
}
