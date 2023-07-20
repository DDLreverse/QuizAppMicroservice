package com.ddl.quizservice.service;

import com.ddl.quizservice.dao.QuizDAO;
import com.ddl.quizservice.model.QuestionWrapper;
import com.ddl.quizservice.model.Quiz;
import com.ddl.quizservice.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDAO quizDAO;
    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        // call the generate url of question service
        // RestTemplate http://localhost:8080/question/generate
        // Not hard code the ip and port
//        List<Integer> questions = ;
//
//        Quiz quiz = new Quiz();
//        quiz.setTitle(title);
//        quiz.setQuestions(questions);
//        quizDAO.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizDAO.findById(id);
        if(quiz.isPresent()) {
//            List<Question> questionsFromDB = quiz.get().getQuestions();
//            List<QuestionWrapper> questionsForUser = new ArrayList<>();
//
//            for (Question q : questionsFromDB) {
//                QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4(), q.getQuestionTitle());
//                questionsForUser.add(qw);
//            }
//
//            return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
        }

        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Optional<Quiz> quiz = quizDAO.findById(id);
        if(quiz.isPresent()) {
//            List<Question> questions = quiz.get().getQuestions();
//            int right = 0;
//            int i = 0;
//            for(Response response: responses) {
//                if(response.getResponse().equals(questions.get(i).getRightAnswer())) {
//                    right++;
//                }
//                i++;
//            }
//
//            return new ResponseEntity<>(right, HttpStatus.OK);
        }

        return new ResponseEntity<>(0, HttpStatus.BAD_REQUEST);
    }
}
