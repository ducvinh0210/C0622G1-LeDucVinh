package quan_ly_phuong_tien.service.impl;

import quan_ly_phuong_tien.model.Truck;
import quan_ly_phuong_tien.service.ITruckService;
import quan_ly_phuong_tien.utils.read_write_file.ReadFileUtils;
import quan_ly_phuong_tien.utils.read_write_file.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {

    public static final String PATH_TRUCK = "src\\quan_ly_phuong_tien\\data\\fileTruck.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<Truck> trucks = new ArrayList<>();

    @Override
    public void addTruck() throws IOException {
        trucks = ReadFileUtils.readFileTruck(PATH_TRUCK);
        Truck truck = this.inforTruck();
        trucks.add(truck);
        WriteFileUtils.writeFileTruck(PATH_TRUCK, trucks);


    }

    @Override
    public void displayAllTruck() throws IOException {
        trucks = ReadFileUtils.readFileTruck(PATH_TRUCK);
        for (Truck truck : trucks) {
            System.out.println(truck);
        }

    }

    @Override
    public void removeTruck() throws IOException {
        trucks = ReadFileUtils.readFileTruck(PATH_TRUCK);
        Truck truck = this.findInfoTruck();
        if (truck == null) {
            System.out.println("khong co thong tin de xoas");
        } else {
            System.out.println("ban co chac minh muon xoa");
            System.out.println("1.co");
            System.out.println("2.khong");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                trucks.remove(truck);

            }
        }
        WriteFileUtils.writeFileTruck(PATH_TRUCK, trucks);
        System.out.println("ban xoa thanh cong");

    }

    @Override
    public void findTruck() {

    }


    public Truck inforTruck() {
        String id;
        System.out.println("moi ban nhap bien kiem soat");
        id = scanner.nextLine();
        String name;
        System.out.println("moi ban nhap ten san xuat");
        name = scanner.nextLine();
        String yearOfManufacture;
        System.out.println("nhap nam san xuat");
        yearOfManufacture = scanner.nextLine();
        String owner;
        System.out.println("nhap chu so huu xe");
        owner = scanner.nextLine();
        double vehicleWeight;
        System.out.println("nhap trong tai xe");
        vehicleWeight = Double.parseDouble(scanner.nextLine());
        Truck truck = new Truck(id, name, yearOfManufacture, owner, vehicleWeight);
        return truck;

    }


    public Truck findInfoTruck() {
        System.out.println("nhap id ban can tim");
        String idTruck = scanner.nextLine();
        for (int i = 0; i < trucks.size(); i++) {
            if (trucks.get(i).getId().equals(idTruck)) {
                return trucks.get(i);
            }

        }
        return null;

    }

}
