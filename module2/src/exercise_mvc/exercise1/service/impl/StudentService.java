package exercise_mvc.exercise1.service.impl;

import exercise_mvc.exercise1.model.Student;
import exercise_mvc.exercise1.service.IStudentService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new
                Student(1, "Vinh", "22/11/1998", 9, "C06"));
        students.add(new
                Student(2, "Vi", "22/11/2000", 9, "C06"));
        students.add(new
                Student(3, "Duc", "1/11/2000", 9, "c06"));
    }

    // them moi hoc sinh
    @Override
    public void addStudent() {
        Student student = this.inforStudent();
        students.add(student);
        System.out.println("Them moi hoc sinh thanh cong");
    }

    //  hien thi hoc sinh
    @Override
    public void displayAllStudent() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // xoa hoc sinh
    @Override
    public void removeStudent() {
        Student student = this.findStudent();
        if (student == null) {
            System.out.println("khong tim thay doi tuong can xoa");
        } else {
            System.out.println("ban co chac muon xoa tai vi tri id " + student.getId() + "khong");
            System.out.println("1. Co");
            System.out.println("2. Khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                students.remove(student);
                System.out.println("Xoa thanh cong");
            }
        }
    }

    public Student findStudent() {
        System.out.println("mời bạn nhập vào vị trí cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }
        }
        return null;
    }

    public Student inforStudent() {
        int id = 0;
        while (true) {
            try {
                System.out.println("mời bạn nhập id");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong phai so");
            } catch (Exception e) {
                if (id <= 0) {
                    System.out.println("ban nhap khong hop le");
                }
            }

        }
        while (true) {
            try {
                if (id <= 0) ;
                break;
            } catch (Exception e) {
                System.out.println("khong duoc thuc hien");
            }
        }


        System.out.println("mời bạn nhập tên");
        String name = scanner.nextLine();
        System.out.println("mời bạn nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("mời bạn nhập điểm");
        double point = Double.parseDouble(scanner.nextLine());
        System.out.println("mời bạn nhập tên lớp");
        String nameClass = scanner.nextLine();
        Student student = new Student(id, name, dateOfBirth, point, nameClass);
        return student;
    }

    // tìm kiếm học sinh theo id và tên
    public void searchStudent() {
        System.out.println("bạn muốn sửa theo 1.id hay 2.tên");
        System.out.println("mời bạn nhập vào đây");
        int choice = scanner.nextInt();
        if (choice == 1) {
            int findId = 0;
            // while (true) {
            try {
                System.out.println("Mời bạn nhập id cần tim");
                findId = scanner.nextInt();
                // break;
            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong phai so, xin nhap lai");
            } catch (Exception e) {
                System.out.println("ban nhap khong hop le, xin nhap le");
            }
            // }
            for (Student student : students) {
                if (student.getId() == findId) {
                    System.out.println(student.toString());
                }
            }

        } else if (choice == 2) {
            System.out.println("Mời bạn nhập tên cần tim");
            String findName = scanner.nextLine();
            for (Student student : students) {
                if (student.getName().contains(findName)) ;

            }
        } else {
            System.out.println("Bạn nhập sai");
        }

    }
// Sắp xếp theo tên hoc sinh

    @Override
    public void sortStudent() {
        boolean isWap = true;
        Student temp;
        for (int i = 0; i < students.size() - 1 && isWap; i++) {
            isWap = false;
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(i).getName().compareTo(students.get(j + 1).getName()) > 0) {
                    isWap = true;
                    temp = students.get(j + 1);
                    students.set(j + 1, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        displayAllStudent();
    }

    @Override
    public void readFile() {
        try {
            System.out.print("xin nhap duong dan file: ");
            String studentPath = scanner.nextLine();

            File fileStudent = new File(studentPath);

            if (!fileStudent.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileStudent));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] student = line.split(",");

                students.add(new Student(Integer.parseInt(student[0]), student[1],
                        student[2], student[3], Double.parseDouble(student[4]), student[5]));
            }
            System.out.println("Đọc file thành công!");
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
