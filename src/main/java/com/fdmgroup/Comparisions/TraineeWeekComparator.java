package com.fdmgroup.Comparisions;

import java.util.Comparator;

public class TraineeWeekComparator implements Comparator<Trainee> {

//    @Override
//    public int compare(Trainee trainee1, Trainee trainee2) {
//        return trainee1.getWeek().compareTo(trainee2.getWeek());
//    }

    //This wont work with double and double wrapper because data can be lost
    @Override
    public int compare(Trainee trainee1, Trainee trainee2) {
        return trainee1.getWeek() - trainee2.getWeek();
    }
}
