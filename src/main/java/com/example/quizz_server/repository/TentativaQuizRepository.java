package com.example.quizz_server.repository;

import com.example.quizz_server.model.TentativaQuiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TentativaQuizRepository extends JpaRepository<TentativaQuiz,Long> {
}
