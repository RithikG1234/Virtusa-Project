package com.virtusa.service;

import com.virtusa.model.Lesson;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LessonRepository {
    public static List<Lesson> lessonList=new ArrayList<>();

    public Lesson addLesson(Lesson lesson){
        lessonList.add(lesson);
        return lesson;
    }

    public Lesson save(Lesson lesson){
        lesson.setId(lesson.getId());
        lesson.setTitle(lesson.getTitle());
        lesson.setImageUrl(lesson.getImageUrl());
        lesson.setVideo(lesson.getVideo());
        lessonList.add(lesson);
        return lesson;
    }

    public List<Lesson> lessonList(){
        return lessonList;
    }

}
