package com.example.quizz_server.model;
import jakarta.persistence.Entity;

@Entity
public class Usuario extends BaseModel{
    String nome;
    String email;
    String senha_hash;
    Enum<TipoPerfil> tipo_perfil;


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getSenha_hash() {return senha_hash;}
    public void setSenha_hash(String senha_hash) {this.senha_hash = senha_hash;}
    public Enum<TipoPerfil> getTipo_perfil() {return tipo_perfil;}
    public void setTipo_perfil(Enum<TipoPerfil> tipo_perfil) {this.tipo_perfil = tipo_perfil;}
}
