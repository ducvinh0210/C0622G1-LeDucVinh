package quan_ly_hoc_sinh.service;

import java.io.IOException;

public interface ITeacherService {
    void addTeacher() throws IOException;
    void removeTeacher() throws IOException;
    void displayAllTeacher() throws IOException;

}
