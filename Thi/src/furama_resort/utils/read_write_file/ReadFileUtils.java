package furama_resort.utils.read_write_file;

import furama_resort.model.Customer;
import furama_resort.model.Employee;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileUtils {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<String> strings = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            strings.add(line);
        }
        bufferedReader.close();
        return strings;

    }

    public static List<Employee> readFileEmployee(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Employee> employeeList = new ArrayList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            employeeList.add(new Employee(info[0], info[1], LocalDate.parse(info[2]), info[3],
                    info[4], info[5], info[6], info[7], info[8], Double.parseDouble(info[9])));

        }
        return employeeList;

    }

    public static List<Customer> readFileCustomer(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Customer> customerList = new LinkedList<>();
        String[] info;
        for (String line : strings) {
            info = line.split(",");
            customerList.add(new Customer(info[0], info[1], LocalDate.parse(info[2]), info[3],
                    info[4], info[5], info[6], info[7], info[8]));
        }
        return customerList;

    }


}
