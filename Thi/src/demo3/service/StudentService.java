package demo3.service;

import demo3.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();


    static {
        students.add(new Student("c12", "le duc vinh", "12/12/2", "nam", "13131", 9));
        students.add(new Student("a1234", "vinh", "122222", "131313", "nam", 10));
        students.add(new Student("d34", "nam", "!@###", "35353", "36363", 6));
        students.add(new Student("b45", "trang", "24242", "nu", "c0622g1", 10));
    }


    @Override
    public void sortStudent() {
        boolean flag = true;
//        Student student= new Student();
//        Collections.sort(students,student);
//        for (Student student1:students) {
//            System.out.println(student1);}
        while (flag) {
            try {
            System.out.println("ban muon sap xep theo id hay theo diem");
            System.out.println("1. theo id");
            System.out.println("2.theo diem");
            System.out.println("3. Tro ve.");
            int choice = Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:

                Collections.sort(students);
                for (Student student1 : students) {
                    System.out.println(student1.toString());
                }
                System.out.println("sap xep theo id thanh cong");

                break;

              case 2:

                System.out.println("sap xep theo diem, nếu điểm trùng nhau thì săp xếp theo tên");
                ScoreComparator scoreComparator = new ScoreComparator();
                Collections.sort(students, scoreComparator);
                for (Student student : students) {
                    System.out.println(student.toString());
                }
                System.out.println("sap xep thanh cong ");
                break;
              case 3:
                  flag = false;
                 break;
              default:
                  System.out.println("ban nhap khong dung dinh dang");
          }

            } catch (NumberFormatException e) {
                System.out.println("bạn nhap khong dung dinh dang");
            }
        }

    }
    @Override
    public void displayAllStudent() {
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
