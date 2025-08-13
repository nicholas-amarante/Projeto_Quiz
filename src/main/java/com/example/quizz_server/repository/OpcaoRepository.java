package com.example.quizz_server.repository;

import com.example.quizz_server.model.Opcao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpcaoRepository extends JpaRepository<Opcao, Long> {
}
