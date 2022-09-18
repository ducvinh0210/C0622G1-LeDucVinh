package quan_ly_phuong_tien.service;

import quan_ly_phuong_tien.model.Car;

import java.io.IOException;

public interface ICarService {
    void addCar() throws IOException;

    void displayAllCar() throws IOException;

    void removeCar() throws IOException;

    void findCar() throws IOException;

}
