package quan_ly_nhan_su.service.impl;

import quan_ly_nhan_su.model.Student;
import quan_ly_nhan_su.service.IStudentService;
import quan_ly_nhan_su.utils.read_write_file.ReadFileUtils;
import quan_ly_nhan_su.utils.read_write_file.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static final String PATH_STUDENT = "src\\quan_ly_nhan_su\\data\\studentFile.csv";
    private static Scanner scanner = new Scanner(System.in);
    List<Student> students = new ArrayList<>();


    @Override
    public void addStudent() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student = this.infoStudent();
        students.add(student);
        WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
    }

    @Override
    public void removeStudent() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student student = this.findStudent();
        if (student == null) {
            System.out.println("khong co du lieu xoa");
        } else {
            System.out.println("ban co muon xoa tai vi tri " + student.getId() + "khong");
            System.out.println("1.co");
            System.out.println("2. khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                students.remove(student);

            }
        }

        System.out.println("xoa thanh cong");
        WriteFileUtils.writeFileStudent(PATH_STUDENT, students);

    }

    @Override
    public void displayStudent() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void editStudent() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        Student studentToEdit = this.findStudent();
        if (studentToEdit == null) {
            System.out.println("khong tim thay doi tuong");
        } else {
            while (true) {
                System.out.println("ban muon sua het hay chi tiet");
                System.out.println("1. Tat ca");
                System.out.println("2. tung chi tiet");
                System.out.println("3.exit");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        String idStudent;
                        while (true) {
                            try {
                                System.out.println("nhap id");
                                idStudent = scanner.nextLine();
                                if (!idStudent.matches("[0-9]{4}")) {
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");
                                }
                                idStudent = "SV-" + idStudent;
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }

                        }
                        String nameStudent;
                        while (true) {
                            try {
                                System.out.println("nhap ten");
                                nameStudent = scanner.nextLine();
                                if (!nameStudent.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");
                                }
                                break;
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String dateOfBirth;
                        while (true) {
                            try {
                                System.out.println("nhap ngay sinh");
                                dateOfBirth = scanner.nextLine();
                                if (!dateOfBirth.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")) {
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String genderStudent;
                        while (true) {
                            try {
                                System.out.println("nhap gioi tinh");
                                genderStudent = scanner.nextLine();
                                if (!(genderStudent.equals("Nam")) && !(genderStudent.equals("Nu"))) {
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }


                        String nameClassStudent;
                        while (true) {
                            try {
                                System.out.println("nhap ten lop");
                                nameClassStudent = scanner.nextLine();
                                if (!nameClassStudent.matches("[C][0-9]{4}[G][1|2]")) {
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());

                            }
                        }

                        double scoreStudent;
                        while (true) {
                            try {
                                System.out.println("nhap diem");
                                scoreStudent = Double.parseDouble(scanner.nextLine());
                                if (scoreStudent < 0 || scoreStudent > 10) {
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        studentToEdit.setId(idStudent);
                        studentToEdit.setName(nameStudent);
                        studentToEdit.setDateOfBirth(dateOfBirth);
                        studentToEdit.setGender(genderStudent);
                        studentToEdit.setNameClass(nameClassStudent);
                        studentToEdit.setScore(scoreStudent);
                        WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                        break;
                    case 2:
                        System.out.println("ban muon sua chuc nang nao");
                        System.out.print("1.sua id\n" +
                                "2.sua ten\n" +
                                "3.sua ngay sinh\n" +
                                "4.sua gioi tinh\n" +
                                "5. sua ten lop \n" +
                                "6. sua diem");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                String id;
                                while (true) {
                                    try {
                                        System.out.println("nhap id");
                                        id = scanner.nextLine();
                                        if (!id.matches("[0-9]{4}")) {
                                            throw new NumberFormatException("ban nhap khong dung dinh dang");
                                        }
                                        id = "SV-" + id;
                                        break;

                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }

                                studentToEdit.setId(id);
                                System.out.println("sua thanh cong ");
                                WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                                break;
                            case 2:
                                System.out.println("nhap ten");
                                studentToEdit.setName(scanner.nextLine());
                                System.out.println("sua thanh cong ");
                                WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                                break;
                            case 3:
                                System.out.println("nhap ngay sinh");
                                studentToEdit.setDateOfBirth(scanner.nextLine());
                                System.out.println("sua thanh cong ");
                                WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                                break;
                            case 4:
                                System.out.println("nhap gioi tinh");
                                studentToEdit.setGender(scanner.nextLine());
                                System.out.println("sua thanh cong ");
                                WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                                break;
                            case 5:
                                System.out.println("nhap ten lop");
                                studentToEdit.setScore(Double.parseDouble(scanner.nextLine()));
                                System.out.println("sua thanh cong ");
                                WriteFileUtils.writeFileStudent(PATH_STUDENT, students);
                                break;
                            case 6:
                                return;
                            default:
                                System.out.println("ban nhap khong dung dinh dang");
                                break;
                        }
                    case 3:
                        return;
                    default:
                        System.out.println("ban nhap khong dung dinh dang");
                }
            }
        }
    }

    @Override
    public void sortStudent() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("ban muon sap xep theo id hay theo diem");
                System.out.println("1. theo id");
                System.out.println("2.theo diemr");
                System.out.println("3. ra menu chinh");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        Collections.sort(students);
                        for (Student student : students) {
                            System.out.println(student.toString());
                        }
                        System.out.println("ban sap xep thanh cong");
                        break;
                    case 2:
                        System.out.println("sap xep diem, neu trung thi sap theo teen");
                        ScoreComparatorStudent scoreComparatorStudent = new ScoreComparatorStudent();
                        Collections.sort(students, scoreComparatorStudent);
                        for (Student student : students) {
                            System.out.println(student.toString());

                        }
                        System.out.println("sap xep thanh cong");
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("ban nhap khong dung chuc nang");
                }
            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong dung dinh dang");
            }
        }
    }

    @Override
    public void findInfoStudent() throws IOException {
        students = ReadFileUtils.readFileStudent(PATH_STUDENT);

        boolean flag = true;
        while (flag) {
            try {
                System.out.println("ban muon tim theo id hay theo ten");
                System.out.println("1. theo id");
                System.out.println("2. theo ten");
                System.out.println("3. thoat ra menu chinh");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("moi bạn nhập id cần tìm");
                        String searchId = scanner.nextLine();
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).getId().contains(searchId)) {
                                System.out.println(students.get(i));
                            }

                        }
                        flag = true;
                        break;
                    case 2:
                        students = ReadFileUtils.readFileStudent(PATH_STUDENT);
                        System.out.println("mời bạn nhập tên cần tìm");
                        String searchName = scanner.nextLine();
                        for (Student student : students) {
                            if (student.getName().contains(searchName)) {
                                System.out.println(student);

                            }
                        }
                        flag = true;
                        break;
                    case 3:
                        flag = false;
                        break;
                    default:
                        System.out.println("ban nhap khong dung dinh dang");

                }
            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong dung dinh dang");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    public Student infoStudent() {
        String id;
        while (true) {
            try {
                System.out.println("Moi ban nhap id");
                id = scanner.nextLine();
                if (!id.matches("[A-Z][0-9]{4}")) {
                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                }
                id = "SV-" + id;
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String name;
        while (true) {
            try {
                System.out.println("moi ban nhap ten");
                name = scanner.nextLine();
                if (!name.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                    throw new NumberFormatException("nhap khong dung dinh dang");
                }
                break;


            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("moi ban nhap ngay sinh");
                dateOfBirth = scanner.nextLine();
//                if (!dateOfBirth.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}")) {
//                    throw new NumberFormatException("nhap khong dung dinh dang");
//
//                }
                if (!dateOfBirth.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")) {
                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String gender = "";
        while (true) {
            try {
//        System.out.println("nhpa gioi tinh");
//        gender = scanner.nextLine();
                boolean check = false;
                System.out.println("moi ban nhap gioi tinh");
                System.out.println("1. Nam");
                System.out.println("2. Nu");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        gender = "Nam";
                        check = true;
                        break;
                    case 2:
                        gender = "Nu";
                        check = true;
                        break;
                    default:
                        System.out.println("ban nhap khong dung chuc nang");
                        break;
                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong dung dinh dang");
            }

        }
        String nameClass;
        while (true) {
            try {
                System.out.println("nhap lop");
                nameClass = scanner.nextLine();
                if (!nameClass.matches("[C][0-9]{4}[G][1|2]")) {
                    throw new NumberFormatException("ban nhap khong dung dinh dang");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        double score;
        while (true) {
            try {
                System.out.println("nhap diem");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 10) {
                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        Student student = new Student(id, name, dateOfBirth, gender, nameClass, score);
        return student;


    }

    public Student findStudent() {
        System.out.println("moi ban nhap id can tim");
        String idStudent = scanner.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(idStudent)) {
                return students.get(i);

            }

        }
        return null;

    }
}
