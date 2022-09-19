package demo3.service;

import demo3.model.Student;

import java.util.Comparator;

public class ScoreComparator implements Comparator<demo3.model.Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getScore()>o2.getScore()){
            return 1;

        }else if (o1.getScore()==o2.getScore()){
            if (o1.getName().compareTo(o2.getName())>0){
                return 1;
            }else if (o1.getName().compareTo(o2.getName())==0){
                return 0;
            }else {
                return -1;
            }
        }else {
            return -1;

        }
    }
}
