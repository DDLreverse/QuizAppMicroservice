package com.ddl.quizservice.controller;

import com.ddl.quizservice.model.QuestionWrapper;
import com.ddl.quizservice.model.QuizDTO;
import com.ddl.quizservice.model.Response;
import com.ddl.quizservice.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDTO quizDTO) {
        return quizService.createQuiz(quizDTO.getCategory(), quizDTO.getNumQ(), quizDTO.getTitle());
    }
    @PostMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id) {
        return quizService.getQuizQuestions(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses) {
        return quizService.calculateResult(id, responses);
    }
}
