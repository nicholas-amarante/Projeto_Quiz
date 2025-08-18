package com.example.quizz_server.repository;

import com.example.quizz_server.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Aluno findByNomeCompleto(String nomeCompleto);
}
