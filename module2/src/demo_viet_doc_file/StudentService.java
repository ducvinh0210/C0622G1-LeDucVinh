package demo_viet_doc_file;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import demo_viet_doc_file.doc_ghi_file.DocFile;
import exercise_mvc.exercise1.model.Student;
import exercise_mvc.exercise1.utils.read_write.WriteFile;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static final String PATH_STUDENT = "src\\demo_viet_doc_file\\studentFile.csv";
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student1> student1List = new ArrayList<>();

    static {
        student1List.add(new Student1("0001", "le duc vinh", "12/10/1998", 8));
        student1List.add(new Student1("0002", "Pham thi vi", "24/5/1868", 9));
    }

    @Override
    public void displayAllStudent1() {
        student1List = this.readFileStudent();
        if (student1List.size() == 0) {
            System.out.println("danh sach roong");
        }
        for (Student1 student1 : student1List) {
            System.out.println(student1);
        }


    }

    @Override
    public void addStudent1() {
        Student1 student1 = this.inforStudent1();
        student1List.add(student1);
        System.out.println("Them moi thanh cong");
        WriteFile.writeFile(PATH_STUDENT,false,covertListStudentToListString(student1List));

    }

    @Override
    public void editStudent1() {
        Student1 student1 = this.findStudent();
        if (student1 == null) {
            System.out.println("khong tim thay doi tuong can sua");
        }
        while (true) {
            System.out.println("ban muon sua thoong tin gi" + student1.getIdStudent());
            System.out.println("1.Ho ten hoc sinh");
            System.out.println("2.ngay sinh");
            System.out.println("3.ban muon sua diem");
            System.out.println("4. ban muon sua tat ca");
            System.out.println("5.exit");
            int choiceInfor = Integer.parseInt(scanner.nextLine());
            switch (choiceInfor) {
                case 1:
                    student1.setNameStudent(scanner.nextLine());
                    break;
                case 2:
                    student1.setDateOfBirth(scanner.nextLine());
                    break;
                case    3:
                    student1.setScore(Double.parseDouble(scanner.nextLine()));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("bạn nhap khong dung dinh dang");
                    break;

            }
            System.out.println("bạn sửa thành công");

        }

    }

    @Override
    public void removeStudent1() {
        Student1 student1 = this.findStudent();
        if (student1 == null) {
            System.out.println("Khong tim thay doi tuong can xoa");

        } else {
            System.out.println("ban co chac muon xoa tai vi tri " + student1.getIdStudent() + "khong");
            System.out.println("1.co");
            System.out.println("2. khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                student1List.remove(student1);
                System.out.println("Xoa thanh cong");
            }
        }

    }

    public Student1 inforStudent1() {
        String idStudent1;
        while (true) {
            try {
                System.out.println("moi ban nhap id");
                idStudent1 = scanner.nextLine();
                for (Student1 student1 : student1List
                ) {
                    if (student1.getIdStudent().equals(idStudent1)) {
                        throw new Exception("ID bi trung moi ban nhap lai");
                    }

                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String nameStudent;
        while (true) {
            try {
                System.out.println("moi ban nhap ten hoc vien");
                nameStudent = scanner.nextLine();
                if (!nameStudent.matches("[A-Z][a-z]{5,15}")) {
                    throw new Exception("ban nhap ten khong dung dinh dang");
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("moi ban nhap ngay sinh cua hoc vien");
                dateOfBirth = scanner.nextLine();
                if (!dateOfBirth.matches("[1-30]")) {
                    throw new Exception("ban nhap ngay sinh khong dung dinh dang");
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        double score;
        while (true) {
            try {
                System.out.println("Moi ban nhap diem cua hoc vien");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 10) {
                    throw new Exception("ban nhap diem khong dung");
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Student1 student1 = new Student1(idStudent1, nameStudent, dateOfBirth, score);
        return student1;


    }

    public   Student1 findStudent() {
        System.out.println("moi ban nhap id");
        String id = scanner.nextLine();
        for (int i = 0; i < student1List.size(); i++) {
            if (student1List.get(i).getIdStudent().equals(id)) {
                return student1List.get(i);
            }
        }
        return null;
    }
    private List<Student1> readFileStudent(){
        List<String> studentList= DocFile.readFile(PATH_STUDENT);
        List<Student1> student1s= new ArrayList<>();
        if (studentList.size()==0){
            System.out.println("du lieu trong file khong co");
            return null;

        }else {
            String[] info;
            Student1 student1;
            for (int i = 0; i <studentList.size() ; i++) {
                info=studentList.get(i).split(",");
                student1= new Student1(info[0],info[1],info[2],Double.parseDouble(info[3]));
                student1s.add(student1);


            }
        }
        return student1s;
    }
    private String convertStudentToString(Student1 student1){
        return student1.getIdStudent()+","+student1.getNameStudent()+","+
                student1.getDateOfBirth()+","+student1.getScore();
    }
    private List<String> covertListStudentToListString(List<Student1> student1s){
        List<String> strings =new ArrayList<>();
        for (Student1 student:student1s) {
           strings.add(convertStudentToString(student));
        }
        return strings;
    }

}
