package furama_resort.service.impl;

import furama_resort.model.Employee;
import furama_resort.service.IEmployeeService;
import furama_resort.utils.exception.CheckException;
import furama_resort.utils.exception.InfomationException;
import furama_resort.utils.read_write_file.ReadFileUtils;
import furama_resort.utils.read_write_file.WriteFileUtils;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public static final String EMPLOYEE_PATH = "src\\furama_resort\\data\\employeeFile.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<Employee> employees = new ArrayList<>();


    @Override
    public void displayAllEmployee() throws IOException {
        employees = ReadFileUtils.readFileEmployee(EMPLOYEE_PATH);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    @Override
    public void addEmployee() throws IOException {
        employees = ReadFileUtils.readFileEmployee(EMPLOYEE_PATH);
        Employee employee = this.infoEmployee();
        employees.add(employee);
        WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH, employees);
    }

    @Override
    public void editEmployee() throws IOException {
        employees = ReadFileUtils.readFileEmployee(EMPLOYEE_PATH);
        Employee employeeToEdit = this.findEmployee();
        if (employeeToEdit == null) {
            System.out.println("khong tim thay doi tuong");

        } else {
            while (true) {
                System.out.println("Bạn muốn sửa thông tin nhân viên tất cả hay chi tiết");
                System.out.println("1. Sửa tất cả");
                System.out.println("2. Sửa chi tiết");
                System.out.println("3. thoát ra menu");
                System.out.println("mời bạn nhập chức năng 1-->3");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        String idEmployee;
                        while (true){
                            try {
                                System.out.println("Nhập id nhân viên muốn thay đổi");
                                idEmployee= scanner.nextLine();
                               break;


                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        String nameEmployee;
                        while (true){
                            try {
                                System.out.println("Nhập tên nhân viên muốn thay đổi");
                                nameEmployee= scanner.nextLine();
                                if(!nameEmployee.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")){
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        LocalDate dateOfBirthEmployee;
                        while (true) {
                            try {
                                System.out.println("nhập ngày thán năm sinh theo định dạng dd-MM-yyyy");
                                dateOfBirthEmployee = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                                CheckException.checkDateOfBirth(dateOfBirthEmployee);
                                break;


                            } catch (DateTimeParseException e) {
                                System.out.println("Định dạng ngày tháng năm dd-MM-yyyy ");
                            } catch (InfomationException e) {
                                System.out.println(e.getMessage());
                            }

                        }
                        String gender = "";
                        while (true) {
                            try {
                                boolean check = true;
                                System.out.println("Mời bạn chọn giới tính");
                                System.out.println("1. Nam");
                                System.out.println("2. Nữ");
                                System.out.println("3. Giới tính thứ 3");
                                System.out.println("Mời bạn nhập từ 1-->3");
                                int choiceGender = Integer.parseInt(scanner.nextLine());
                                switch (choiceGender) {
                                    case 1:
                                        gender = "Nam";
                                        check = true;
                                        break;
                                    case 2:
                                        gender = "Nữ";
                                        check = true;
                                        break;
                                    case 3:
                                        gender = "Giới tính thứ 3";
                                        check = true;
                                        break;
                                    default:
                                        System.out.println("bạn nhập không đúng chức năng");
                                        break;
                                }
                                if (check) {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Bạn nhập không đúng");
                            }


                        }
                        String identityCard;
                        while (true) {
                            try {
                                System.out.println("Mời bạn số chứng minh nhân dân");
                                identityCard = scanner.nextLine();
                                if (!identityCard.matches("[0-9]{11}")) {
                                    throw new NumberFormatException("Bạn nhập không đúng định dạng, bạn nhập dạng số gồm 11 số");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                                ;
                            }
                        }
                        String phoneNumber;
                        while (true) {
                            try {
                                System.out.println("mời bạn nhập số điện thoại của nhân viên");
                                phoneNumber = scanner.nextLine();
                                if (!phoneNumber.matches("[0][9][0-9]{8}")) {
                                    throw new NumberFormatException("Bạn nhập không đúng, số điện thoại gồm 10 số, bắt đầu là 09");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String email;
                        while (true) {
                            try {
                                System.out.println("mời bạn nhập email nhân viên");
                                email = scanner.nextLine();
                                if (!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                                    throw new NumberFormatException("Bạn nhập không đúng ");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String levelEmployee = "";
                        while (true) {
                            try {
                                boolean check = true;
                                System.out.println("Mời bạn nhập trình độ nhân viên");
                                System.out.println("1. Trung cấp");
                                System.out.println("2. Cao đẳng");
                                System.out.println("3. Đại học");
                                System.out.println("4. Sau đại học");
                                System.out.println("mời bạn nhập 1-->4");
                                int choiceLevel = Integer.parseInt(scanner.nextLine());
                                switch (choiceLevel) {
                                    case 1:
                                        levelEmployee = "Trung cấp";
                                        check = true;
                                        break;
                                    case 2:
                                        levelEmployee = "Cao đẳng";
                                        check = true;
                                        break;
                                    case 3:
                                        levelEmployee = "Đại học";
                                        check = true;
                                        break;
                                    case 4:
                                        levelEmployee = "Sau đại học";
                                        check = true;
                                        break;
                                    default:
                                        System.out.println("bạn nhập không đúng định dạng");
                                        break;

                                }
                                if (check) {
                                    break;
                                }


                            } catch (NumberFormatException e) {
                                System.out.println("bạn nhập không đúng");
                            }
                        }
                        String workPosition = "";
                        while (true) {
                            try {
                                boolean check = true;
                                System.out.println("Mời bạn nhập vị trí nhân viên");
                                System.out.println("1.Lễ tân");
                                System.out.println("2.Phục vụ");
                                System.out.println("3.Chuyên viên");
                                System.out.println("4.Giám sát");
                                System.out.println("5.Quản lý");
                                System.out.println("6.Giám đốc");
                                System.out.println("nhập chức năng 1-->6");
                                int choiceWorkPosition = Integer.parseInt(scanner.nextLine());
                                switch (choiceWorkPosition) {
                                    case 1:
                                        workPosition = "Lễ tân";
                                        check = true;
                                        break;
                                    case 2:
                                        workPosition = "Phục vụ";
                                        check = true;
                                        break;
                                    case 3:
                                        workPosition = "Chuyên viên";
                                        check = true;
                                        break;
                                    case 4:
                                        workPosition = "Giám sát";
                                        check = true;
                                        break;
                                    case 5:
                                        workPosition = "Quản lý";
                                        check = true;
                                        break;
                                    case 6:
                                        workPosition = "Giám đốc";
                                        check = true;
                                        break;
                                    default:
                                        System.out.println("bạn nhập không đúng định dạng");
                                        break;

                                }
                                if (check) {
                                    break;
                                }


                            } catch (NumberFormatException e) {
                                System.out.println("bạn nhập không đúng ");
                            }
                        }
                        double salaryEmployee;
                        while (true) {
                            try {
                                System.out.println("Mời bạn nhập lương nhân viên");
                                salaryEmployee = Double.parseDouble(scanner.nextLine());
                                if (salaryEmployee < 0 || salaryEmployee > 1000000000) {
                                    throw new NumberFormatException("ban nhap khong dung");


                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        employeeToEdit.setId(idEmployee);
                        employeeToEdit.setName(nameEmployee);
                        employeeToEdit.setDateOfBirth(dateOfBirthEmployee);
                        employeeToEdit.setGender(gender);
                        employeeToEdit.setIdentityCard(identityCard);
                        employeeToEdit.setPhoneNumber(phoneNumber);
                        employeeToEdit.setEmail(email);
                        employeeToEdit.setLevel(levelEmployee);
                        employeeToEdit.setJob(workPosition);
                        employeeToEdit.setSalary(salaryEmployee);
                        WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                        break;
                    case 2:
                        ReadFileUtils.readFileEmployee(EMPLOYEE_PATH);
                        System.out.println("bạn muốn sửa chức năng");
                        System.out.println("1. Sửa id nhân viên\n" +
                                "2. Sửa tên nhân viên\n" +
                                "3. Sửa ngày sinh nhân viên\n" +
                                "4. Sửa giới tính nhân viên\n" +
                                "5. Sửa số CMND nhân viên\n" +
                                "6. Sửa số điện thoại nhân viên\n" +
                                "7. Sửa Email nhân viên\n" +
                                "8. Sửa trình độ nhân viên\n" +
                                "9. Sửa vị trí nhân viên\n" +
                                "10. Sửa lương nhân viên\n"+
                                "11.exit\n");
                        System.out.println("mời bạn nhập chức năng 1-->11");
                        int choice2= Integer.parseInt(scanner.nextLine());
                        switch (choice2){
                            case 1:
                                String codeEmployee;
                                while (true){
                                    try {
                                        System.out.println("Nhập id nhân viên muốn thay đổi");
                                        codeEmployee= scanner.nextLine();
                                        break;


                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                employeeToEdit.setId(codeEmployee);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 2:
                                String nameEmployee1;
                                while (true){
                                    try {
                                        System.out.println("Nhập tên nhân viên muốn thay đổi");
                                        nameEmployee1= scanner.nextLine();
                                        if(!nameEmployee1.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")){
                                            throw new NumberFormatException("ban nhap khong dung dinh dang");

                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                employeeToEdit.setName(nameEmployee1);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 3:

                                LocalDate dateOfBirthEmployee1;
                                while (true) {
                                    try {
                                        System.out.println("nhập ngày thán năm sinh theo định dạng dd-MM-yyyy");
                                        dateOfBirthEmployee1 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                                        CheckException.checkDateOfBirth(dateOfBirthEmployee1);
                                        break;


                                    } catch (DateTimeParseException e) {
                                        System.out.println("Định dạng ngày tháng năm dd-MM-yyyy ");
                                    } catch (InfomationException e) {
                                        System.out.println(e.getMessage());
                                    }

                                }
                                employeeToEdit.setDateOfBirth(dateOfBirthEmployee1);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 4:


                                String genderEmployee = "";
                                while (true) {
                                    try {
                                        boolean check = true;
                                        System.out.println("Mời bạn chọn giới tính");
                                        System.out.println("1. Nam");
                                        System.out.println("2. Nữ");
                                        System.out.println("3. Giới tính thứ 3");
                                        System.out.println("Mời bạn nhập từ 1-->3");
                                        int choiceGender = Integer.parseInt(scanner.nextLine());
                                        switch (choiceGender) {
                                            case 1:
                                                genderEmployee = "Nam";
                                                check = true;
                                                break;
                                            case 2:
                                                genderEmployee = "Nữ";
                                                check = true;
                                                break;
                                            case 3:
                                                genderEmployee = "Giới tính thứ 3";
                                                check = true;
                                                break;
                                            default:
                                                System.out.println("bạn nhập không đúng chức năng");
                                                break;
                                        }
                                        if (check) {
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Bạn nhập không đúng");
                                    }


                                }
                                employeeToEdit.setGender(genderEmployee);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 5:

                                String identityCardEmployee;
                                while (true) {
                                    try {
                                        System.out.println("Mời bạn số chứng minh nhân dân");
                                        identityCardEmployee = scanner.nextLine();
                                        if (!identityCardEmployee.matches("[0-9]{11}")) {
                                            throw new NumberFormatException("Bạn nhập không đúng định dạng, bạn nhập dạng số gồm 11 số");
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());

                                    }
                                }
                                employeeToEdit.setIdentityCard(identityCardEmployee);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 6:

                                String phoneNumberEmployee;

                                while (true) {
                                    try {
                                        System.out.println("mời bạn nhập số điện thoại của nhân viên");
                                        phoneNumberEmployee = scanner.nextLine();
                                        if (!phoneNumberEmployee.matches("[0][9][0-9]{8}")) {
                                            throw new NumberFormatException("Bạn nhập không đúng, số điện thoại gồm 10 số, bắt đầu là 09");
                                        }
                                        break;

                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                employeeToEdit.setPhoneNumber(phoneNumberEmployee);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 7:

                                String emailEmployee;
                                while (true) {
                                    try {
                                        System.out.println("mời bạn nhập email nhân viên");
                                        emailEmployee = scanner.nextLine();
                                        if (!emailEmployee.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                                            throw new NumberFormatException("Bạn nhập không đúng ");
                                        }
                                        break;

                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                employeeToEdit.setEmail(emailEmployee);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 8:

                                String levelEmployee1 = "";
                                while (true) {
                                    try {
                                        boolean check = true;
                                        System.out.println("Mời bạn nhập trình độ nhân viên");
                                        System.out.println("1. Trung cấp");
                                        System.out.println("2. Cao đẳng");
                                        System.out.println("3. Đại học");
                                        System.out.println("4. Sau đại học");
                                        System.out.println("mời bạn nhập 1-->4");
                                        int choiceLevel = Integer.parseInt(scanner.nextLine());
                                        switch (choiceLevel) {
                                            case 1:
                                                levelEmployee1 = "Trung cấp";
                                                check = true;
                                                break;
                                            case 2:
                                                levelEmployee1 = "Cao đẳng";
                                                check = true;
                                                break;
                                            case 3:
                                                levelEmployee1 = "Đại học";
                                                check = true;
                                                break;
                                            case 4:
                                                levelEmployee1 = "Sau đại học";
                                                check = true;
                                                break;
                                            default:
                                                System.out.println("bạn nhập không đúng định dạng");
                                                break;

                                        }
                                        if (check) {
                                            break;
                                        }


                                    } catch (NumberFormatException e) {
                                        System.out.println("bạn nhập không đúng");
                                    }
                                }
                                employeeToEdit.setLevel(levelEmployee1);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 9:

                                String workPositionEmployee = "";
                                while (true) {
                                    try {
                                        boolean check = true;
                                        System.out.println("Mời bạn nhập vị trí nhân viên");
                                        System.out.println("1.Lễ tân");
                                        System.out.println("2.Phục vụ");
                                        System.out.println("3.Chuyên viên");
                                        System.out.println("4.Giám sát");
                                        System.out.println("5.Quản lý");
                                        System.out.println("6.Giám đốc");
                                        System.out.println("nhập chức năng 1-->6");
                                        int choiceWorkPosition = Integer.parseInt(scanner.nextLine());
                                        switch (choiceWorkPosition) {
                                            case 1:
                                                workPositionEmployee = "Lễ tân";
                                                check = true;
                                                break;
                                            case 2:
                                                workPositionEmployee = "Phục vụ";
                                                check = true;
                                                break;
                                            case 3:
                                                workPositionEmployee = "Chuyên viên";
                                                check = true;
                                                break;
                                            case 4:
                                                workPositionEmployee = "Giám sát";
                                                check = true;
                                                break;
                                            case 5:
                                                workPositionEmployee = "Quản lý";
                                                check = true;
                                                break;
                                            case 6:
                                                workPosition = "Giám đốc";
                                                check = true;
                                                break;
                                            default:
                                                System.out.println("bạn nhập không đúng định dạng");
                                                break;

                                        }
                                        if (check) {
                                            break;
                                        }


                                    } catch (NumberFormatException e) {
                                        System.out.println("bạn nhập không đúng ");
                                    }
                                }
                                employeeToEdit.setJob(workPositionEmployee);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 10:

                                double salaryEmployee1;
                                while (true) {
                                    try {
                                        System.out.println("Mời bạn nhập lương nhân viên");
                                        salaryEmployee1 = Double.parseDouble(scanner.nextLine());
                                        if (salaryEmployee1 < 0 || salaryEmployee1 > 1000000000) {
                                            throw new NumberFormatException("ban nhap khong dung");


                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                employeeToEdit.setSalary(salaryEmployee1);
                                WriteFileUtils.writeFileEmployee(EMPLOYEE_PATH,employees);
                                break;
                            case 11:
                                return;
                            default:
                                System.out.println("ban nhap khong dung");
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

    public Employee infoEmployee() {
        String idEmployee;
        while (true) {
            try {
                System.out.println("Mời bạn nhập id nhân viên");
                idEmployee = scanner.nextLine();
                for (Employee employee : employees) {
                    if (employee.getId().equals(idEmployee)) {
                        throw new InfomationException("Id đã trùng, mời bạn nhập lại");

                    }

                }
                break;
            } catch (InfomationException e) {
                System.out.println(e.getMessage());
            }
        }

        String nameEmployee;
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên nhân viên");
                nameEmployee = scanner.nextLine();
                if (!nameEmployee.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                    throw new NumberFormatException("Bạn nhập không đúng, mời bạn nhập lại");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        LocalDate dateOfBirth;
        while (true) {
            try {
                System.out.println("nhập ngày thán năm sinh theo định dạng dd-MM-yyyy");
                dateOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                CheckException.checkDateOfBirth(dateOfBirth);
                break;


            } catch (DateTimeParseException e) {
                System.out.println("Định dạng ngày tháng năm dd-MM-yyyy ");
            } catch (InfomationException e) {
                System.out.println(e.getMessage());
            }

        }
        String gender = "";
        while (true) {
            try {
                boolean check = true;
                System.out.println("Mời bạn chọn giới tính");
                System.out.println("1. Nam");
                System.out.println("2. Nữ");
                System.out.println("3. Giới tính thứ 3");
                System.out.println("Mời bạn nhập từ 1-->3");
                int choiceGender = Integer.parseInt(scanner.nextLine());
                switch (choiceGender) {
                    case 1:
                        gender = "Nam";
                        check = true;
                        break;
                    case 2:
                        gender = "Nữ";
                        check = true;
                        break;
                    case 3:
                        gender = "Giới tính thứ 3";
                        check = true;
                        break;
                    default:
                        System.out.println("bạn nhập không đúng chức năng");
                        break;
                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng");
            }


        }
        String identityCard;
        while (true) {
            try {
                System.out.println("Mời bạn số chứng minh nhân dân");
                identityCard = scanner.nextLine();
                if (!identityCard.matches("[0-9]{11}")) {
                    throw new NumberFormatException("Bạn nhập không đúng định dạng, bạn nhập dạng số gồm 11 số");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                ;
            }
        }
        String phoneNumber;
        while (true) {
            try {
                System.out.println("mời bạn nhập số điện thoại của nhân viên");
                phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("[0][9][0-9]{8}")) {
                    throw new NumberFormatException("Bạn nhập không đúng, số điện thoại gồm 10 số, bắt đầu là 09");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String email;
        while (true) {
            try {
                System.out.println("mời bạn nhập email nhân viên");
                email = scanner.nextLine();
                if (!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                    throw new NumberFormatException("Bạn nhập không đúng ");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String levelEmployee = "";
        while (true) {
            try {
                boolean check = true;
                System.out.println("Mời bạn nhập trình độ nhân viên");
                System.out.println("1. Trung cấp");
                System.out.println("2. Cao đẳng");
                System.out.println("3. Đại học");
                System.out.println("4. Sau đại học");
                System.out.println("mời bạn nhập 1-->4");
                int choiceLevel = Integer.parseInt(scanner.nextLine());
                switch (choiceLevel) {
                    case 1:
                        levelEmployee = "Trung cấp";
                        check = true;
                        break;
                    case 2:
                        levelEmployee = "Cao đẳng";
                        check = true;
                        break;
                    case 3:
                        levelEmployee = "Đại học";
                        check = true;
                        break;
                    case 4:
                        levelEmployee = "Sau đại học";
                        check = true;
                        break;
                    default:
                        System.out.println("bạn nhập không đúng định dạng");
                        break;

                }
                if (check) {
                    break;
                }


            } catch (NumberFormatException e) {
                System.out.println("bạn nhập không đúng");
            }
        }
        String workPosition = "";
        while (true) {
            try {
                boolean check = true;
                System.out.println("Mời bạn nhập vị trí nhân viên");
                System.out.println("1.Lễ tân");
                System.out.println("2.Phục vụ");
                System.out.println("3.Chuyên viên");
                System.out.println("4.Giám sát");
                System.out.println("5.Quản lý");
                System.out.println("6.Giám đốc");
                System.out.println("nhập chức năng 1-->6");
                int choiceWorkPosition = Integer.parseInt(scanner.nextLine());
                switch (choiceWorkPosition) {
                    case 1:
                        workPosition = "Lễ tân";
                        check = true;
                        break;
                    case 2:
                        workPosition = "Phục vụ";
                        check = true;
                        break;
                    case 3:
                        workPosition = "Chuyên viên";
                        check = true;
                        break;
                    case 4:
                        workPosition = "Giám sát";
                        check = true;
                        break;
                    case 5:
                        workPosition = "Quản lý";
                        check = true;
                        break;
                    case 6:
                        workPosition = "Giám đốc";
                        check = true;
                        break;
                    default:
                        System.out.println("bạn nhập không đúng định dạng");
                        break;

                }
                if (check) {
                    break;
                }


            } catch (NumberFormatException e) {
                System.out.println("bạn nhập không đúng ");
            }
        }
        double salaryEmployee;
        while (true) {
            try {
                System.out.println("Mời bạn nhập lương nhân viên");
                salaryEmployee = Double.parseDouble(scanner.nextLine());
                if (salaryEmployee < 0 || salaryEmployee > 1000000000) {
                    throw new NumberFormatException("ban nhap khong dung");


                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        Employee employee = new Employee(idEmployee, nameEmployee, dateOfBirth, gender,
                identityCard, phoneNumber, email, levelEmployee, workPosition, salaryEmployee);
        return employee;
    }

    public Employee findEmployee() {
        System.out.println("Nhập id nhân viên cần tìm");
        String idEmployee = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(idEmployee)) {
                return employees.get(i);
            }
        }
        return null;
    }
}
