package com.fdmgroup.Comparisions;

import java.util.Comparator;

public class TraineeWeekNameComparator implements Comparator<Trainee> {

    @Override
    public int compare(Trainee o1, Trainee o2) {
        if(o1.getWeek().equals(o2.getWeek())){
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getWeek().compareTo(o2.getWeek());
    }
}
