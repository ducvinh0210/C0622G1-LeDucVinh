package mvc1.exercise_person.view;

import exercise_mvc.exercise1.controller.StudentController;

import java.util.Scanner;

public class MainView {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentController studentController= new StudentController();
    public static void menu(){
        while (true){
            System.out.println("________________________");
            System.out.println("chọn người cần quản lý");
            System.out.println("1. học sinh");
            System.out.println("2. giáo viên ");
            System.out.println("0. exit");
            System.out.println("mời bạn nhập chức năng từ 0-->2:");
            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice){
//                case 1:
//                        studentController.menuStudent();
////                case 2:
////                    teacherController.menuTeacher();
//            }
//



        }
    }

    public static void main(String[] args) {
        menu();
    }

















}
