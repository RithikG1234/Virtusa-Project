package com.virtusa.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class QuizResult {

    private int score;
    private List<Integer> incorrectAnswers;

    public QuizResult(int score, List<Integer> incorrectAnswers) {
        this.score = score;
        this.incorrectAnswers = incorrectAnswers;
    }
}
