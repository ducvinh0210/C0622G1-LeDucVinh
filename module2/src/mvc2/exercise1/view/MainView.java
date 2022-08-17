package mvc2.exercise1.view;

import mvc2.exercise1.controller.StudentController;

import java.util.Scanner;

public class MainView {

    public static void main(String[] args) {
         StudentController studentController= new StudentController();
        studentController.menuManagement();

    }


}
