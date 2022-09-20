package com.fdmgroup.Mockito.Stubbing.Exercises.Verfication;

import com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.Classroom;
import com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.Trainee;
import com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.Trainer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class TestClassroom {
    @Mock
    Trainer MockTrainer;

    @Mock
    Trainee MockTrainee1,MockTrainee2,MockTrainee3,MockTrainee4,MockTrainee5;


    Classroom classroom;

    @BeforeEach
    void setUp() throws Exception{
        classroom = new Classroom();
        classroom.setTrainer(MockTrainer);

    }


    @Test
    void test_VerifyWhenClassroomStartLessonMethodIsCalledThenCallsMockTrainerObject() {
        classroom.startLesson();
        verify(MockTrainer).teach();
    }

    @Test
    void test_VerifyWhenClassroomEndLessonMethodIsCalledThenCallsTheMockTrainerObjectPrepareMethod(){
        classroom.endLesson();
        verify(MockTrainer).prepareLesson();
    }

    @Test
    void test_VerifyWhenClassroomStartExamMethodIsCalledItCallsMockTrainersInvigilateExamMethod(){
        classroom.startExam("Exam");
        verify(MockTrainer).invigilateExam("Exam");
    }

    @Test
    void test_VerifyWhenClassroomReviewAllTraineesCodeMethodCalledItCallsMockTrainersReviewCodeMethod3Times(){
        List<Trainee> traineesList = new ArrayList<>(Arrays.asList(MockTrainee1,MockTrainee2,MockTrainee3));

        classroom.setTrainees(traineesList);
        classroom.reviewAllTraineesCode();

        verify(MockTrainer).reviewTraineeCode(MockTrainee1);
        verify(MockTrainer).reviewTraineeCode(MockTrainee2);
        verify(MockTrainer).reviewTraineeCode(MockTrainee3);

    }

    @Test
    void test_VerifyWhenClassroomReviewAllTraineesCodeMethodCalledItCallsMockTrainersReviewCodeMethod5Times(){
        List<Trainee> MockTraineesList = new ArrayList<>(Arrays.asList(MockTrainee1,MockTrainee2, MockTrainee3,MockTrainee4,MockTrainee5));

        classroom.setTrainees(MockTraineesList);
        classroom.reviewAllTraineesCode();
        verify(MockTrainer).reviewTraineeCode(MockTrainee1);
        verify(MockTrainer).reviewTraineeCode(MockTrainee2);
        verify(MockTrainer).reviewTraineeCode(MockTrainee3);
        verify(MockTrainer).reviewTraineeCode(MockTrainee4);
        verify(MockTrainer).reviewTraineeCode(MockTrainee5);
    }

    @Test
    void test_VerifyWhenClassroomStartLessonIsCalledItCallsTheLearnMethodOn3MockTrainees(){
        List<Trainee> traineesList = new ArrayList<>(Arrays.asList(MockTrainee1,MockTrainee2,MockTrainee3));

        classroom.setTrainees(traineesList);
        classroom.startLesson();
        verify(MockTrainee1).learn();
        verify(MockTrainee2).learn();
        verify(MockTrainee3).learn();
    }

    @Test
    void test_VerifyWhenClassroomStartLessonIsCalledItCallsTheLearnMethod5MockTrainees(){
        List<Trainee> MockTraineesList = new ArrayList<>(Arrays.asList(MockTrainee1,MockTrainee2, MockTrainee3,MockTrainee4,MockTrainee5));

        classroom.setTrainees(MockTraineesList);
        classroom.startLesson();
        verify(MockTrainee1).learn();
        verify(MockTrainee2).learn();
        verify(MockTrainee3).learn();
        verify(MockTrainee4).learn();
        verify(MockTrainee5).learn();


    }

}
