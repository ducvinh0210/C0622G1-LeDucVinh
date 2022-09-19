package quan_ly_nhan_su.service.impl;

import quan_ly_nhan_su.model.Student;

import java.util.Comparator;

public class ScoreComparatorStudent implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getScore()>student2.getScore()){
            return 1;

        }else if (student1.getScore()==student2.getScore()){
            if (student1.getName().compareTo(student2.getName())>0){
                return 1;

            }else if (student1.getName().compareTo(student2.getName())==0){
                return 0;

            }else {
                return -1;
            }
        }else {
            return -1;
        }
    }
}
