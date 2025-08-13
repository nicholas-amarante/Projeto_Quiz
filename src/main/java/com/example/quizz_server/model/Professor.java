package com.example.quizz_server.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.HashSet;
import java.util.Set;

@Entity
@AttributeOverride(name="id", column=@Column(name="id_professor"))
public class Professor extends BaseModel{
    @NotBlank
    @Column(nullable = false)
    private String formacao;
    @NotBlank
    @Column(nullable = false)
    private String area_formacao;
    @OneToMany(mappedBy = "professor")
    @Column(nullable = false)
    private Set<ProfessorTurma> turmas=new HashSet<>();

    public String getFormacao() {return formacao;}
    public void setFormacao(String formação) {this.formacao = formacao;}
    public String getArea_formacao() {return area_formacao;}
    public void setArea_formacao(String area_formação) {this.area_formacao = area_formacao;}
    public Set<ProfessorTurma> getTurmas() {return turmas;}
    public void setTurmas(Set<ProfessorTurma> turmas) {this.turmas = turmas;}
}
