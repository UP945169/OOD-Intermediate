package com.fdmgroup.Comparisions;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee("Tom", 4, 78.9);
        Trainee trainee2 = new Trainee("Jane", 12, 98.2);
        Trainee trainee3 = new Trainee("Bob", 9, 65.3);

        List<Trainee> trainees  = new ArrayList<>(Arrays.asList(trainee1, trainee2, trainee3));

        //creates a new object no need for reference
        Collections.sort(trainees, new TraineeWeekComparator());

//        for(Trainee trainee : trainees) {
//            System.out.println(trainee.getName() + " week: " + trainee.getWeek() + " score: " + trainee.getAverageExamScore());
//        }

        Set<Trainee> traineeByWeek = new TreeSet<Trainee>(new TraineeWeekComparator());
        traineeByWeek.add(trainee1);
        traineeByWeek.add(trainee2);
        traineeByWeek.add(trainee3);

        for(Trainee trainee : trainees) {
            System.out.println(trainee.getName() + " week: " + trainee.getWeek() + " score: " + trainee.getAverageExamScore());
        }

    }
}
