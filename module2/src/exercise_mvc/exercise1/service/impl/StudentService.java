package exercise_mvc.exercise1.service.impl;

import exercise_mvc.exercise1.model.Student;
import exercise_mvc.exercise1.service.IStudentService;
import exercise_mvc.exercise1.utils.exception.NameException;
import exercise_mvc.exercise1.utils.read_write.ReadFile;
import exercise_mvc.exercise1.utils.read_write.WriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentService implements IStudentService {
    public static final String SRC_EXERCISE_MVC_EXERCISE_1_DATA_STUDENT_FILE_CSV = "src\\exercise_mvc\\exercise1\\data\\studentFIle.csv";
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
        // students.add(student);
        //System.out.println("Them moi hoc sinh thanh cong");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        System.out.println("them moi thanh cong");
        WriteFile.writeFile(SRC_EXERCISE_MVC_EXERCISE_1_DATA_STUDENT_FILE_CSV, true, convertListStudentToListString(studentList));
    }

    //  hien thi hoc sinh
    @Override
    public void displayAllStudent() {
        students= this.readFileStudent();
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

        String name;
        String nameRegex = "[A-Za-z]{5,50}";

        while (true) {
            try {
                System.out.println("mời bạn nhập tên");
                name = scanner.nextLine();
                if (!(name.matches(nameRegex))) {
                    throw new NameException("Ban nhap ten khong hop le. vui long nhap ten khong phai la so va ki tu dac biet");
                }
                break;
            } catch (NameException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("mời bạn nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("mời bạn nhập điểm");
        double point = Double.parseDouble(scanner.nextLine());
        //nhap ten lop
        String nameClass;
        String nameClassRegex = "[AC][0-9]{4}[GL][1]";
        System.out.println("mời bạn nhập tên lớp");
        nameClass = scanner.nextLine();
        nameClass.matches(nameClassRegex);


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

    // doc ghi file
//    @Override
//    public void readFile() {
//        try {
//            System.out.print("xin nhap duong dan file: ");
//            String studentPath = scanner.nextLine();
//
//            File fileStudent = new File(studentPath);
//
//            if (!fileStudent.exists()) {
//                throw new FileNotFoundException();
//            }
//
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileStudent));
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] student = line.split(",");
//
//                students.add(new Student(Integer.parseInt(student[0]), student[1],
//                        student[2], student[3], Double.parseDouble(student[4]), student[5]));
//            }
//            System.out.println("doc thanh cong");
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("file khong tim thay");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    // doc ghi file

    private List<Student> readFileStudent() {
        List<String> studentList = ReadFile.readFile(SRC_EXERCISE_MVC_EXERCISE_1_DATA_STUDENT_FILE_CSV);
        List<Student> students = new ArrayList<>();
        if (studentList.size() == 0) {
            System.out.println("Dữ liệu trong file không có");
            return null;

        } else {
            String[] propertiesOfStudent;
            Student student;
            for (int i = 0; i < studentList.size(); i++) {
                propertiesOfStudent = studentList.get(i).split(",");
                if (propertiesOfStudent.length == 5) {
                    student = new Student(Integer.parseInt(propertiesOfStudent[0]), propertiesOfStudent[1], propertiesOfStudent[2], Double.parseDouble(propertiesOfStudent[3]), propertiesOfStudent[4]);
                    students.add(student);
                }
            }
            return students;
        }
    }

    private String convertStudentToString(Student student) {
        return student.getId() + "," + student.getName() + "," + student.getDateOfBirth() + "," + student.getPoint() + "," + student.getNameClass();
    }

    private List<String> convertListStudentToListString(List<Student> students) {
        List<String> strings = new ArrayList<>();
        for (Student student : students) {
            strings.add(convertStudentToString(student));
        }
        return strings;
    }

}
