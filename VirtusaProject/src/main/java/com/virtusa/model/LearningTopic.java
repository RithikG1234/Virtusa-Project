package com.virtusa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LearningTopic {

    private Integer id;
    private String topicName;
    private String description;
    private String duration;
    private int price;

    @JsonIgnoreProperties(value = {"learningTopic"})
    private List<Quiz> quizList;

    public LearningTopic(Integer id, String topicName, String description, String duration, int price) {
        this.id = id;
        this.topicName = topicName;
        this.description = description;
        this.duration = duration;
        this.price = price;
    }
}
