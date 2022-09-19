package quan_ly_nhan_su.service;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void removeStudent() throws IOException;

    void displayStudent() throws IOException;

    void editStudent() throws IOException;

    void sortStudent() throws IOException;

    void findInfoStudent() throws IOException;


}
