package luyen_tap_thi_module2.service.impl;

import exercise_mvc.exercise1.utils.read_write.ReadFile;
import luyen_tap_thi_module2.model.Student;
import luyen_tap_thi_module2.service.IStudentService;
import luyen_tap_thi_module2.utils.read_write_file.file_student.ReadFileStudent;
import luyen_tap_thi_module2.utils.read_write_file.read_and_write_file.ReadFileUtils;
import luyen_tap_thi_module2.utils.read_write_file.read_and_write_file.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static final String PATH_STUDENT = "src\\luyen_tap_thi_module2\\data\\student.txt";
    Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    int choice;


    @Override
    public void display() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void add() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student = this.infoStudent();
        students.add(student);
        WriteFileUtils.writeFileStudent(PATH_STUDENT, students);

    }

    @Override
    public void remove() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student = this.findStudent();
        if (student == null) {
            System.out.println("khong tim thay doi tuong");
        } else {
            System.out.println("ban muon xoa tai vi tri id" + student.getId() + "khong");
            System.out.println("1.co");
            System.out.println("2.khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                students.remove(student);


            }
            System.out.println("xoa thanh cong");
            WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
        }


    }

    @Override
    public void edit() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student studentToEdit = this.findStudent();
        if (studentToEdit == null) {
            System.out.println("khong tim thay doi tuong");

        } else {
            System.out.println("ban muon sua het hay tung thuoc tinh");
            System.out.println("1.tat ca");
            System.out.println("2.chi tiet");
            choice = Integer.parseInt(scanner.nextLine());
            String newId;
            String newName;
            double newScore;
            switch (choice) {
                case 1:
                    System.out.println("nhap id");
                    newId = scanner.nextLine();
                    System.out.println("nhap ten");
                    newName = scanner.nextLine();
                    System.out.println("nhap diem");
                    newScore = Double.parseDouble(scanner.nextLine());
                    studentToEdit.setId(newId);
                    studentToEdit.setName(newName);
                    studentToEdit.setScore(newScore);
                    WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                    break;
                case 2:
                    System.out.println("ban muon sua chuc nang gi");
                    System.out.println("1. id");
                    System.out.println("2. name");
                    System.out.println("3. score");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("nhap id");
                            newId = scanner.nextLine();
                            studentToEdit.setId(newId);
                            System.out.println("Sua thanh cong");
                            WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                            break;
                        case 2:
                            System.out.println("nhap ten");
                            newName = scanner.nextLine();
                            studentToEdit.setName(newName);
                            System.out.println("Sua thanh cong");
                            WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                            //   studentToEdit.setName(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("nhap diemr");
                            studentToEdit.setScore(Double.parseDouble(scanner.nextLine()));
                            WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("ban nhap khong hop le");
                            break;
                    }
                    break;
            }
        }


    }

    public Student infoStudent() {
        String id;
        System.out.println("moi ban nhap id");
        id = scanner.nextLine();
        String name = "";
        while (true) {
            try {
                boolean check = false;
                System.out.println("nhap ten");
                System.out.println("1.Vinh");
                System.out.println("2.Vi");
                System.out.println("3.Duc");
                int choiceName= Integer.parseInt(scanner.nextLine());
                switch (choiceName){
                    case 1:
                        name="Vinh";
                        check=true;
                        break;
                    case    2:
                        name="Vi";
                        check= true;
                        break;
                    case 3:
                        name="Duc";
                        check= true;
                        break;
                    default:
                        System.out.println("ban nhap khong dung chuc nang");
                        break;
                }
                if (check){
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong dung dang so");
            }
        }


//        System.out.println("Moi ban nhap ten");
//        name = scanner.nextLine();
        double score;
        System.out.println("nhap diem");
        score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, score);
        return student;
    }

    public Student findStudent() {
        System.out.println("Moi ban nhap id can tim");
        String idStudent = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(idStudent)) {
                return students.get(i);

            }
        }
        return null;
    }
}
