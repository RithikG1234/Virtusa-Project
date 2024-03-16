package com.virtusa.service;

import com.virtusa.Exception.RecordNotFoundException;
import com.virtusa.model.LearningTopic;
import com.virtusa.model.Quiz;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LearningRepository {
    private static List<LearningTopic> learningTopicList=new ArrayList<>();


    public List<LearningTopic> getAllTopic(){
        return learningTopicList;
    }

    public LearningTopic save(LearningTopic learningTopic){
        learningTopic.setId(learningTopic.getId());
        learningTopic.setTopicName(learningTopic.getTopicName());
        learningTopic.setDescription(learningTopic.getDescription());
        learningTopic.setDuration(learningTopic.getDuration());
        learningTopic.setPrice(learningTopic.getPrice());
        for(Quiz q: learningTopic.getQuizList()){
            q.setLearningTopic(learningTopic);

        }
        QuizeRepository.quizList.addAll(learningTopic.getQuizList());

        learningTopicList.add(learningTopic);

        return learningTopic;
    }

    public String deleteTopic(Integer id){
        learningTopicList.removeIf(x->x.getId()==(id));
        return null;
    }

    public LearningTopic updateTopic(LearningTopic learningTopic){
        int idx=0;
        int id=0;
        for (int i=0;i<learningTopicList.size();i++){
            if(learningTopicList.get(i).getId()==(learningTopic.getId())){
                id=learningTopic.getId();
                idx=i;
                break;
            }
        }
        LearningTopic learningTopic1=new LearningTopic();
        learningTopic1.setId(id);
        learningTopic1.setTopicName(learningTopic.getTopicName());
        learningTopic1.setDescription(learningTopic.getDescription());
        learningTopic1.setPrice(learningTopic.getPrice());
        learningTopic1.setDuration(learningTopic.getDuration());
        learningTopicList.set(idx,learningTopic);
        return learningTopic1;
    }

    public LearningTopic findById(Integer id) throws RecordNotFoundException {
        return learningTopicList.stream().filter(learningTopic -> learningTopic.getId().equals(id)).findFirst().orElseThrow(()->new RecordNotFoundException("Id Not Found"));

    }

    public List<Quiz> getAllQuizByLearningTopicId(Integer id) throws RecordNotFoundException {
        LearningTopic learningTopic=findById(id);
        return learningTopic.getQuizList();
    }

}
