package com.example.quizz_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Tema extends BaseModel{
    @NotBlank
    @Column(nullable = false)
    private String titulo;
    @NotBlank
    @Column(nullable = false)
    private String categoria;

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo=titulo;}
    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {categoria = categoria;}
}
