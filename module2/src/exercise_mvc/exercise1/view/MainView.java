package exercise_mvc.exercise1.view;

import exercise_mvc.exercise1.controller.StudentController;

/**
 *
 */
public class MainView {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.menuManagement();

    }

}
