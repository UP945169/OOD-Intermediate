package com.fdmgroup.Comparisions;

import java.util.Comparator;

public class TraineeScoreComparator implements Comparator<Trainee> {

    @Override
    public int compare(Trainee o1, Trainee o2) {
        return  ( (Double) o1.getAverageExamScore()).compareTo(o2.getAverageExamScore());
    }
}
