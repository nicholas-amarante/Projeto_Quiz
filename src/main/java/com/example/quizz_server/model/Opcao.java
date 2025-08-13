package com.example.quizz_server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Opcao extends BaseModel{
    @NotBlank
    @JoinColumn(nullable = false)
    private String textoOpcao;
    @NotNull
    @JoinColumn(nullable = false)
    private Boolean ehCorreta;
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_questao", nullable=false)
    private Questao questao;

    public String getTextoOpcao() {return textoOpcao;}
    public void setTextoOpcao(String textoOpcao) {this.textoOpcao = textoOpcao;}
    public Boolean getEhCorreta() {return ehCorreta;}
    public void setEhCorreta(Boolean ehCorreta) {this.ehCorreta = ehCorreta;}
    public Questao getQuestao() {return questao;}
    public void setQuestao(Questao questao) {this.questao = questao;}

}
