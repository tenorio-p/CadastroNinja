package com.java10x.CadastroDeNinjas.Missoes;

import com.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;
    // Uma missao pode ter varos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

    public MissoesModel() {
    }

    public MissoesModel(String nomeMissao, String dificuldade,  List<NinjaModel> ninja) {
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }

    public Long getId() {
        return id;
    }


    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<NinjaModel> getNinja() {
        {
            return ninja;
        }
    }

    public void setNinja(List<NinjaModel> ninja) {
            this.ninja = ninja;
        }

}
