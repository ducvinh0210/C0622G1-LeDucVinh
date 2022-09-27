package furama_resort.utils.read_write_file;

import furama_resort.model.Customer;
import furama_resort.model.Employee;

import java.io.*;
import java.util.List;

public class WriteFileUtils {

    private static void writeFile(String path, String data) throws IOException {

        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }

    public static void writeFileEmployee(String path, List<Employee> employees) throws IOException {
        String data = "";
        for (Employee employee : employees) {
            data += employee.toString();
            data += "\n";

        }
        writeFile(path,data);
    }
    public static void  writeFileCustomer(String path, List<Customer> customers) throws IOException {
        String data="";
        for (Customer customer: customers) {
            data+=customer.toString();
            data+="\n";

        }
        writeFile(path,data);
    }


}
