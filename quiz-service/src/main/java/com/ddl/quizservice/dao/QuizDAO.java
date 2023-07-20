package com.ddl.quizservice.dao;

import com.ddl.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDAO extends JpaRepository<Quiz, Integer> {
}
