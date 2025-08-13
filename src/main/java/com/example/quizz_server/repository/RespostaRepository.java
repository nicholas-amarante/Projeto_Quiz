package com.example.quizz_server.repository;

import com.example.quizz_server.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespostaRepository extends JpaRepository<Turma,Long> {
}
