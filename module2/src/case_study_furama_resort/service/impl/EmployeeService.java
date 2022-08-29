package case_study_furama_resort.service.impl;

import case_study_furama_resort.model.Employee;
import case_study_furama_resort.service.IEmployeeService;
import case_study_furama_resort.utils.exception.IdException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new
                Employee("NV001", "Vinh", "22/11/1998", "Nam", 12345, 9876545, "ldvinh@gmail.com", "Dai hoc", "Giam Doc", 1000000));
        employees.add(new
                Employee("NV002", "Vi", "2/10/2000", "Nu", 23456, 8765432, "ptvi@gmail.com", "Dai hoc", "Quan ly", 900000));
    }


    @Override
    public void displayAllEmployee() {
        if (employees.size() == 0) {
            System.out.println("Không có thông tin để hiển thị");
        }
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    @Override
    public void addEmployee() {
        Employee employee = this.inforEmployee();
        employees.add(employee);
//        List<Employee>employeeList= new ArrayList<>();
//        employeeList.add(employee);
        System.out.println("Thêm mới thành công");


    }

    @Override
    public void editEmployee() {
        System.out.println("Nhập id cần chỉnh sửa");
        String employeeId= scanner.nextLine();
        for (int i = 0; i <employees.size() ; i++) {
            if(employees.get(i).getId().equals(employeeId)){
                employees.set(i,inforEmployee());
            }
        }
        System.out.println("Bạn sửa thành công");

    }

    public Employee inforEmployee() {
        /**
         * Nhập id nhân viên
         */
        String id;
        while (true) {
            try {
                System.out.println("Mời bạn nhập id");
                id = scanner.nextLine();
                for (Employee employee : employees) {
                    if (employee.getId().equals(id)) {
                        throw new IdException("Id này đã tồn tại, mời bạn nhập lại");
                    }

                }
                break;

            } catch (IdException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                System.out.println("Bạn nhập không hợp lệ");
            }
        }
        /**
         * Nhập tên nhân viên
         */
        String name;
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên nhân viên");
                name = scanner.nextLine();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Bạn nhập không đúng dạng chữ, mời nhập lại");
            } catch (Exception e) {
                System.out.println("Bạn nhập không hợp lệ");
            }
        }
        /**
         * Nhập ngày sinh
         */
        String dateOfBirth;
        while (true) {
            try {
                System.out.println("Mời bạn nhập ngày sinh nhân viên theo định dạng ngày/tháng/năm ");
                dateOfBirth = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Bạn nhập không đúng định dạng, mời bạn nhập lại");
            } catch (Exception e) {
                System.out.println("Bạn nhập không hợp lệ");

            }
        }
        /**
         * nhập giới tính
         */
        String gender;
        while (true) {
            try {
                System.out.println("Mời bạn nhập giới tính");
                gender = scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Bạn nhập không đúng dạng chữ, mời bạn nhập lại");

            } catch (Exception e) {
                System.out.println("Bạn nhập không hợp lệ");
            }
        }
/**
 * chưa try catch(exception), nhập chứng minh nhân dân
 */
        int identityCard;
        System.out.println("Mời bạn nhập căn cước công dân của nhân viên ");
        identityCard = Integer.parseInt(scanner.nextLine());
        /**
         * số điện thoại,email chưa try catch
         */
        int phoneNumber;
        System.out.println("Mời bạn nhập số điện thoại");
        phoneNumber = Integer.parseInt(scanner.nextLine());
        /**
         * email
         */
        String email;
        System.out.println("Mời bạn nhập email");
        email = scanner.nextLine();
        /**
         *trình độ nhân viên
         */
        String level;

        while (true) {
            try {
                System.out.println("Mời bạn nhập trình độ nhân viên:1.Trung cấp\n2.Cao đẳng\n3.Đại học\n4.Sau đại học");
                level = scanner.nextLine();
                if (!level.equals("Trung cấp") && !level.equals("Cao đẳng") && !level.equals("Đại học") && !level.equals("Sau đại học")) {
                    throw new IdException("Bạn nhập trình độ không đúng");

                }
                break;
            } catch (IdException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Bạn nhập không hợp lệ");
            }
        }
        /**
         * vị trí của nhân viên
         */
        String job;
        while (true) {
            try {
                System.out.println("Mời bạn nhập vị trí của nhân viên:1.Lễ tân\n2.Phục vụ\n3.Chuyên viên\n4.Giám sát\n5.Quản lý\n6.Giám đốc");
                job = scanner.nextLine();
                if (!job.equals("Lễ tân") && !job.equals("Phục vụ") && !job.equals("Chuyên viên") && !job.equals("Giám sát") && !job.equals("Quản lý") && !job.equals("Giám đốc")) {
                    throw new Exception("Bạn nhập vị trí nhân viên không đúng định dạng yêu cầu mời bạn nhập lại");

                }
                break;

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        double salary;
        while (true) {
            try {
                System.out.println("Mời bạn nhập lương của nhân viên");
                salary = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng dạng số, mời bạn nhập lại");
            } catch (Exception e) {
                System.out.println("Bạn nhập không đúng định dạng");
            }
        }
        Employee employee = new Employee(id, name, dateOfBirth, gender, identityCard, phoneNumber, email, level, job, salary);
        return employee;


    }

    /**
     * tìm nhân viên theo id
     *
     * @return
     */
    public Employee findEmployee() {
        System.out.println("Mời bạn nhập id nhân viên");
        String id = scanner.nextLine();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId().equals(id)) {
                return employees.get(i);
            }
        }
        return null;
    }


}

