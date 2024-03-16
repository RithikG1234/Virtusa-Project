package com.virtusa.controller;


import com.virtusa.Exception.RecordNotFoundException;
import com.virtusa.model.LearningTopic;
import com.virtusa.model.Quiz;
import com.virtusa.service.LearningRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/learningTopic")
public class LearningTopicController {

    @Autowired
    LearningRepository learningRepository;

    @PostMapping("/add")
    public LearningTopic addLeaningTopic(@RequestBody LearningTopic learningTopic){
        return learningRepository.save(learningTopic);
        //return learningRepository.addLearningTopic(learningTopic);
    }
    @GetMapping("/getAllTopicByQuiz/{id}")
    public List<Quiz> getAllTopicByQuiz(@PathVariable Integer id) throws RecordNotFoundException {
        return learningRepository.getAllQuizByLearningTopicId(id);
    }

}
