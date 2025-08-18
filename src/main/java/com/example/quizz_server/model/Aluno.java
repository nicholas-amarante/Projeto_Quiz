package com.example.quizz_server.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "id_aluno")
public class Aluno extends Usuario{
    @NotBlank
    @Column(nullable = false)
    private String matricula;
    @NotNull
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public LocalDate getDataNascimento() {return dataNascimento;}
    public void setData_nascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}
}
