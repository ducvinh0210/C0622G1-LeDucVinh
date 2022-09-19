package quan_ly_phuong_tien.service.impl;

import quan_ly_phuong_tien.model.Car;
import quan_ly_phuong_tien.service.ICarService;
import quan_ly_phuong_tien.utils.read_write_file.ReadFileUtils;
import quan_ly_phuong_tien.utils.read_write_file.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    public static final String PATH_CAR = "src\\quan_ly_phuong_tien\\data\\fileCar.csv";
    static Scanner scanner= new Scanner(System.in);
   static List<Car> cars= new ArrayList<>();

    @Override
    public void addCar() throws IOException {
        cars= ReadFileUtils.readFileCar(PATH_CAR);
        Car car= this.infoCar();
        cars.add(car);
        WriteFileUtils.writeFileCar(PATH_CAR,cars);

    }

    @Override
    public void displayAllCar() throws IOException {
        cars= ReadFileUtils.readFileCar(PATH_CAR);
        for (Car car:cars) {
            System.out.println(car);

        }

    }

    @Override
    public void removeCar() throws IOException {
        cars= ReadFileUtils.readFileCar(PATH_CAR);
        Car car= this.findInfoCar();
        if (car==null){
            System.out.println("khong co du lieu de xoa");
        }else {
            System.out.println("bạn có chắc muốn xóa không");
            System.out.println("1.có");
            System.out.println("2. khong");
            int choice= Integer.parseInt(scanner.nextLine());
            if (choice==1){
                cars.remove(car);

            }
        }
        WriteFileUtils.writeFileCar(PATH_CAR,cars);
        System.out.println("xóa thành công");

    }

    @Override
    public void findCar() throws IOException {
        cars= ReadFileUtils.readFileCar(PATH_CAR);
        System.out.println("bạn muốn tìm kiếm theo id hay tên");
        System.out.println("1. theo id");
        System.out.println("2. theo tên");
        int choice= Integer.parseInt(scanner.nextLine());
        if (choice==1){
            System.out.println("mời bạn nhập id");
            String id= scanner.nextLine();
            for (int i = 0; i <cars.size() ; i++) {
                if (cars.get(i).getId().equals(id)){
                    System.out.println(cars.get(i));
                }


            }
        }else if(choice==2) {
            cars= ReadFileUtils.readFileCar(PATH_CAR);
            System.out.println("moi ban nhap ten");
            String nameCar= scanner.nextLine();
            for (Car car: cars) {
                if (car.getName().contains(nameCar)){
                    System.out.println(car);
                }

            }
        }else {
            System.out.println("ban lua chon sai");
        }


    }

    public  Car infoCar(){
        String id;
        System.out.println("moi ban nhap bien kiem soat");
        id= scanner.nextLine();
        String name;
        System.out.println("moi ban nhap ten san xuat");
        name= scanner.nextLine();
        String yearOfManufacture;
        System.out.println("nhap nam san xuat");
        yearOfManufacture=scanner.nextLine();
        String owner;
        System.out.println("nhap chu so huu xe");
        owner= scanner.nextLine();
        int numberOfSeats;
        System.out.println("nhap so cho ngoi");
        numberOfSeats= Integer.parseInt(scanner.nextLine());
        String vehicleType;
        System.out.println("nhap kieu xe");
        vehicleType= scanner.nextLine();
        Car car= new Car(id,name,yearOfManufacture,owner,numberOfSeats,vehicleType);
        return car;
    }




    public  Car findInfoCar(){
        System.out.println("moi ban nhap id can tim");
        String idCar= scanner.nextLine();
        for (int i = 0; i <cars.size() ; i++) {
            if (cars.get(i).getId().equals(idCar)){
                return cars.get(i);
            }
        }
        return null;


    }


}
