package com.example.quizz_server.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends BaseModel{
    @NotBlank
    @Column(name = "nome_completo", nullable = false)
    private String nomeCompleto;
    @NotBlank
    private String email;
    @NotBlank
    @Column(name = "senha_hash")
    private String senhaHash;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private TipoPerfil tipo_perfil;

    public String getNomeCompleto() {return nomeCompleto;}
    public void setNomeCompleto(String nomeCompleto) {this.nomeCompleto = nomeCompleto;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getSenhaHash() {return senhaHash;}
    public void setSenhaHash(String senha_hash) {this.senhaHash = senhaHash;}
    public TipoPerfil getTipo_perfil() {return tipo_perfil;}
    public void setTipo_perfil(TipoPerfil tipo_perfil) {this.tipo_perfil = tipo_perfil;}
}
