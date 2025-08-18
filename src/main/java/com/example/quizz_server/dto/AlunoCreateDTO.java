package com.example.quizz_server.dto;

import com.example.quizz_server.model.TipoPerfil;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class AlunoCreateDTO {
    @NotBlank(message="O nome completo é obrigatório.")
    @Size(min=3, max=255)
    private String nomeCompleto;

    @NotBlank(message="O email é obrigatório.")
    @Email(message="O formato do email é inválido.")
    private String email;

    @NotBlank(message="A senha é obrigatória.")
    @Size(min=8, message="A senha deve ter no mínimo 8 caracteres.")
    private String senha;

    @NotNull(message="O tipo de perfil é obrigatório.")
    private TipoPerfil tipoPerfil;

    @NotBlank(message="A matrícula é obrigatória.")
    private String matricula;

    @NotNull(message="A data de nascimento é obrigatória.")
    private LocalDate dataNascimento;

    public AlunoCreateDTO() {}

    public String getNomeCompleto() {return nomeCompleto;}
    public void setNomeCompleto(String nomeCompleto) {this.nomeCompleto = nomeCompleto;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}
    public TipoPerfil getTipoPerfil() {return tipoPerfil;}
    public void setTipoPerfil(TipoPerfil tipoPerfil) {this.tipoPerfil = tipoPerfil;}
    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    public LocalDate getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}
}
