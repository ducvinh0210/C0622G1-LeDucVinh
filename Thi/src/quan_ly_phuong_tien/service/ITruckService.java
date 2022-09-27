package quan_ly_phuong_tien.service;

import java.io.IOException;

public interface ITruckService {
    void addTruck() throws IOException;

    void displayAllTruck() throws IOException;

    void removeTruck() throws IOException;

    void findTruck() throws IOException;
}
