package com.virtusa.service;

import com.virtusa.model.Quiz;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuizeRepository {
    public static List<Quiz> quizList =new ArrayList<>();
    public Quiz addQuizSave(Quiz quiz){
        quizList.add(quiz);
        return quiz;
    }
}
