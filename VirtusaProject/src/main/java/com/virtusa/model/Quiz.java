package com.virtusa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {
    private Integer id;
    private String question;
    private List<String> options;
    private int answer;

    private LearningTopic learningTopic;

    public Quiz(Integer id, String question, List<String> options, int answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }
}
