package com.virtusa.controller;

import com.virtusa.model.LearningTopic;
import com.virtusa.model.Lesson;
import com.virtusa.model.User;
import com.virtusa.service.LearningRepository;
import com.virtusa.service.LessonRepository;
import com.virtusa.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    LearningRepository learningRepository;
    @Autowired
    LessonRepository lessonRepository;

    @Autowired


    // Users
    @GetMapping("/userList")
    public List<User> getAllUser(){
        return userRepository.getAllUser();
    }

    // Learning Topic

    @GetMapping("/getLearningList")
    public List<LearningTopic> getLearningTopicList(){
        return learningRepository.getAllTopic();
    }

    @PutMapping("/updateTopic")
    public LearningTopic updateTopic(@RequestBody LearningTopic learningTopic){
        return learningRepository.updateTopic(learningTopic);
    }

    @DeleteMapping("/deleteTopic/{id}")
    public String deleteTopic(@PathVariable Integer id){
         learningRepository.deleteTopic(id);
         return "Topic deleted!! "+id;
    }

    //Lesson
    @PostMapping("/lessons/addLesson")
    public Lesson addTopicLesson(@RequestBody Lesson lesson){
        return lessonRepository.save(lesson);
    }

    @GetMapping("/lessons/listLesson")
    public List<Lesson> getListLesson(){
        return lessonRepository.lessonList();
    }

}
