package com.example.quizz_server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class TentativaQuiz extends BaseModel{
    @NotNull
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_quiz", nullable = false)
    private Quiz quiz;
    @ManyToOne(fetch=FetchType.LAZY)
    @NotNull
    @JoinColumn(name="id_aluno",  nullable = false)
    private Aluno aluno;
    @NotNull
    @Column(nullable = false)
    private LocalDateTime localDataHora;
    @NotNull
    @Column(nullable = false)
    private int pontucao;
    @NotNull
    @Column(nullable = false)
    private Enum<StatusQuiz> status;

    public Quiz getQuiz() {return quiz;}
    public void setQuiz(Quiz quiz) {this.quiz = quiz;}
    public Aluno getAluno() {return aluno;}
    public void setAluno(Aluno aluno) {this.aluno = aluno;}
    public LocalDateTime getLocalDataHora() {return localDataHora;}
    public void setLocalDataHora(LocalDateTime localDataHora) {this.localDataHora = localDataHora;}
    public int getPontucao() {return pontucao;}
    public void setPontucao(int pontucao) {this.pontucao = pontucao;}
    public Enum<StatusQuiz> getStatus() {return status;}
    public void setStatus(Enum<StatusQuiz> status) {this.status = status;}

}
