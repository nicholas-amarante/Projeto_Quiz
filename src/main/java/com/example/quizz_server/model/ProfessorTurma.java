package com.example.quizz_server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
@Entity
@Table(name = "professor_turma")
public class ProfessorTurma{
    @EmbeddedId
    private ProfessorTurmaId id=new ProfessorTurmaId();
    @NotNull
    @ManyToOne
    @MapsId("professorId")
    @JoinColumn(name="id_professor", nullable = false)
    private Professor professor;
    @NotNull
    @ManyToOne
    @MapsId("turmaId")
    @JoinColumn(name="id_turma", nullable = false)
    private Turma turma;
    @JoinColumn(nullable = false)
    private LocalDate dataInicio;

    public ProfessorTurmaId getId() {return id;}
    public void setId(ProfessorTurmaId id) {this.id = id;}
    public Professor getProfessor() {return professor;}
    public void setProfessor(Professor professor) {this.professor = professor;}
    public Turma getTurma() {return turma;}
    public void setTurma(Turma turma) {this.turma = turma;}
    public LocalDate getDataInicio() {return dataInicio;}
    public void setDataInicio(LocalDate dataInicio) {this.dataInicio = dataInicio;}
}
