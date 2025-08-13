package com.example.quizz_server.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public class Resposta extends BaseModel{
    @NotBlank
    @JoinColumn(nullable = false)
    private String respostaTexto;
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_questao", nullable = false)
    private Questao questao;
    @NotNull
    @ManyToOne
    @JoinColumn(name="id_tentativa_quiz", nullable = false)
    private TentativaQuiz tentativaQuiz;
    @NotNull
    @JoinColumn(nullable = false)
    private Boolean ehCorreta;
    @NotNull
    @JoinColumn(nullable = false)
    private LocalDate data_hora;

    public String getRespostaTexto() {return respostaTexto;}
    public void setRespostaTexto(String respostaTexto) {this.respostaTexto = respostaTexto;}
    public Questao getQuestao() {return questao;}
    public void setQuestao(Questao questao) {this.questao = questao;}
    public TentativaQuiz getTentativaQuiz() {return tentativaQuiz;}
    public void setTentativaQuiz(TentativaQuiz tentativaQuiz) {this.tentativaQuiz = tentativaQuiz;}
    public Boolean getEhCorreta() {return ehCorreta;}
    public void setEhCorreta(Boolean ehCorreta) {this.ehCorreta = ehCorreta;}
    public LocalDate getData_hora() {return data_hora;}
    public void setData_hora(LocalDate data_hora) {this.data_hora = data_hora;}
}
