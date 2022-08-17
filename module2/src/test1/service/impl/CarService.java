package test1.service.impl;

import exercise_mvc.exercise1.model.Student;
import test1.model.Car;
import test1.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("a", "a", "a", "a", 1, "a"));
        carList.add(new Car("b", "b", "b", "b", 2, "b"));
    }

    @Override
    public void create() {

//        System.out.println("mời bạn nhập bien kiem soat");
//        String bienKiemSoat = scanner.nextLine();
//        System.out.println("mời bạn nhập hang san xuat");
//        String hangSanXuat = scanner.nextLine();
//        System.out.println("mời bạn nhập nam san xuat");
//        String namSanXuat = scanner.nextLine();
//        System.out.println("mời bạn chu so huu");
//        String chuSoHuu = scanner.nextLine();
//        System.out.println("mời bạn nhập so cho ngoi");
//        int soChoNgoi = Integer.parseInt(scanner.nextLine());
//        System.out.println("mời bạn nhập kieu xe");
//        String kieuXe = scanner.nextLine();
//        Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);


        Car car = this.carInfor();
        carList.add(car);
        System.out.println("Them moi Car thanh cong");
    }

    @Override
    public void display() {
        for (Car car:carList) {
            System.out.println(car);
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public void find() {
        Car car = this.carFind();
        if (car != null) {
            System.out.println(car);
        } else {
            System.out.println("Bien kiem soat khong ton tai");
        }
    }

    public Car carInfor() {
        System.out.println("mời bạn nhập bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("mời bạn nhập hang san xuat");
        String hangSanXuat = scanner.nextLine();
        System.out.println("mời bạn nhập nam san xuat");
        String namSanXuat = scanner.nextLine();
        System.out.println("mời bạn chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("mời bạn nhập so cho ngoi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập kieu xe");
        String kieuXe = scanner.nextLine();
        Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        return car;
    }
    public Car carFind(){
        System.out.println("mời bạn nhập bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        Car car = new Car();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                car = carList.get(i);
                break;
            } else {
                return null;
            }
        }

        return car;
    }

}
