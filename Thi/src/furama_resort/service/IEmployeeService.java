package furama_resort.service;

import java.io.IOException;

public interface IEmployeeService {
    void displayAllEmployee() throws IOException;
    void addEmployee() throws IOException;
    void editEmployee() throws IOException;

}
