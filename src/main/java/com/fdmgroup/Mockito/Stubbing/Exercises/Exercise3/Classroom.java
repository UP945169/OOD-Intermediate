package com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3;

import java.util.List;

public class Classroom {
    private Trainer trainer;
    private List<Trainee> trainees;

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }

    public void startLesson(){
        trainer.teach();
        for (int i = 0; i < trainees.size(); i++) {
            trainees.get(i).learn();
        }
    }
    public void endLesson(){
        trainer.prepareLesson();
    }
    public void startExam(String topic){
        trainer.invigilateExam(topic);
    }
    public void reviewAllTraineesCode(){
        for (int i = 0; i < trainees.size(); i++) {
            trainer.reviewTraineeCode(trainees.get(i));
        }
    }


}
