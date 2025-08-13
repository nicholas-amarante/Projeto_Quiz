package com.example.quizz_server.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Quiz extends BaseModel{
    @NotBlank(message = "O Titulo do Quiz não pode ser vazio")
    @JoinColumn(nullable = false)
    private String titulo;
    @NotBlank
    @JoinColumn(nullable = false)
    private String descrição;
    @NotNull
    @JoinColumn(nullable = false)
    private LocalDate dataCriacao;
    @NotNull
    @Enumerated(EnumType.STRING)
    @JoinColumn(nullable = false)
    private StatusQuiz status;
    @ManyToOne(fetch=FetchType.LAZY)
    @NotNull
    @JoinColumn(name="id_professor", nullable = false)
    private Professor professor;
    @NotNull
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_tema", nullable=false)
    private Tema tema;
    @NotNull
    @OneToMany(mappedBy="quiz" /*mapeado pelo campo na entidade Questao*/, cascade=CascadeType.ALL, orphanRemoval=true)
    private List<Questao> questoes;

    public List<Questao> getQuestoes() {return questoes;}
    public void setQuestoes(List<Questao> questoes) {this.questoes = questoes;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getDescrição() {return descrição;}
    public void setDescrição(String descrição) {this.descrição = descrição;}
    public LocalDate getDataCriacao() {return dataCriacao;}
    public void setDataCriacao(LocalDate dataCriacao) {this.dataCriacao = dataCriacao;}
    public StatusQuiz getStatus() {return status;}
    public void setStatus(StatusQuiz status) {this.status = status;}
    public Professor getProfessor() {return professor;}
    public void setProfessor(Professor professor) {this.professor = professor;}
    public Tema getTema() {return tema;}
    public void setTema(Tema tema) {this.tema = tema;}
}
