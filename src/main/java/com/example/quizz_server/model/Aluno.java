package com.example.quizz_server.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
@Entity
public class Aluno extends Usuario{
    @NotBlank
    @Column(nullable = false)
    private String matricula;
    @NotNull
    @Column(nullable = false)
    private LocalDate data_nascimento;

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public LocalDate getData_nascimento() {return data_nascimento;}
    public void setData_nascimento(LocalDate data_nascimento) {this.data_nascimento = data_nascimento;}
}
