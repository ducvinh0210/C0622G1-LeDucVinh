package quan_ly_nhan_su.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;
    void removeTeacher() throws IOException;
    void displayTeacher() throws IOException;

}
