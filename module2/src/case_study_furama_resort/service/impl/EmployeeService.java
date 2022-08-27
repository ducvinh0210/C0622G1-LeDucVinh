package case_study_furama_resort.service.impl;

import case_study_furama_resort.model.Employee;
import case_study_furama_resort.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
  private static   Scanner scanner= new Scanner(System.in);
   private static List<Employee> employees=new ArrayList<>();
   static {
    employees.add(new
            Employee("NV001","Vinh","22/11/1998","Nam",12345,9876545,"ldvinh@gmail.com","Dai hoc","Giam Doc",1000000));
   employees.add(new
           Employee("NV002","Vi","2/10/2000","Nu",23456,8765432,"ptvi@gmail.com","Dai hoc","Quan ly",900000) );
   }




    @Override
    public void displayAllEmployee() {
if (employees.size()==0){
 System.out.println("Không có thông tin để hiển thị");
}
     for (Employee employee:employees) {
      System.out.println(employee);
      
     }
    }

    @Override
    public void addEmployee() {

    }

    @Override
    public void editEmployee() {

    }
}
