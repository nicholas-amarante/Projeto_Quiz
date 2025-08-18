package com.example.quizz_server.response;

import com.example.quizz_server.model.Aluno;
import com.example.quizz_server.model.TipoPerfil;

import java.time.LocalDate;

public class AlunoResponseDTO {
    private String nome;
    private String email;
    private String matricula;
    private LocalDate dataNascimento;
    private TipoPerfil tipoPerfil;

    public AlunoResponseDTO(Aluno aluno){
        this.nome=aluno.getNomeCompleto();
        this.email=aluno.getEmail();
        this.matricula=aluno.getMatricula();
        this.dataNascimento=aluno.getDataNascimento();
        this.tipoPerfil=aluno.getTipo_perfil();
    }

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public LocalDate getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}
    public TipoPerfil getTipoPerfil() {return tipoPerfil;}
    public void setTipoPerfil(TipoPerfil tipoPerfil) {this.tipoPerfil = tipoPerfil;}
}
