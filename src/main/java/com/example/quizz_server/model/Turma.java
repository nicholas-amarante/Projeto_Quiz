package com.example.quizz_server.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@AttributeOverride(name="id", column=@Column(name="id_turma"))
public class Turma extends BaseModel{
    @NotBlank
    @JoinColumn(nullable = false)
    private String nome_turma;
    @NotNull
    @JoinColumn(nullable = false)
    private Integer ano_turma;
    @NotNull
    @OneToMany(mappedBy = "turma")
    private Set<ProfessorTurma> professores=new HashSet<>();

    public String getNome_turma() {return nome_turma;}
    public void setNome_turma(String nome_turma) {this.nome_turma = nome_turma;}
    public Integer getAno_turma() {return ano_turma;}
    public void setAno_turma(Integer ano_turma) {this.ano_turma = ano_turma;}
}
