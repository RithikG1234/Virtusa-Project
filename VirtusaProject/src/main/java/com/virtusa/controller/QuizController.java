package com.virtusa.controller;

import com.virtusa.model.Quiz;
import com.virtusa.model.QuizResult;
import com.virtusa.service.QuizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user/quizzes")
public class QuizController {

   @Autowired
    QuizeRepository quizeRepository;

   @PostMapping("/addQuiz")
   public Quiz addQuize(@RequestBody Quiz quiz){
       return quizeRepository.addQuizSave(quiz);
   }

    @GetMapping
    public List<Quiz> getQuizzesForModule() {
        // For simplicity, return all quizzes for any moduleId
        return QuizeRepository.quizList;
    }

    @PostMapping("/{quizId}")
    public QuizResult submitQuizAnswers(@PathVariable int quizId, @RequestBody List<Integer> answers) {
        Quiz quiz = QuizeRepository.quizList.stream().filter(q -> q.getId() == quizId).findFirst().orElse(null);
        if (quiz == null) {
            throw new IllegalArgumentException("Invalid quiz ID: " + quizId);
        }

        int score = 0;
        List<Integer> incorrectAnswers = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i) == quiz.getAnswer()) {
                score++;
            } else {
                incorrectAnswers.add(i);
            }
        }

        return new QuizResult(score, incorrectAnswers);
    }
}
