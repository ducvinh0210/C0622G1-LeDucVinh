package quan_ly_phuong_tien.service.impl;

import quan_ly_phuong_tien.model.MotorBike;
import quan_ly_phuong_tien.service.IMotorBikeService;
import quan_ly_phuong_tien.utils.read_write_file.ReadFileUtils;
import quan_ly_phuong_tien.utils.read_write_file.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorBikeService implements IMotorBikeService {
    public static final String PATH_MOTOR = "src\\quan_ly_phuong_tien\\data\\fileMotorBike.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<MotorBike> motorBikes = new ArrayList<>();


    @Override
    public void addMotorBike() throws IOException {
        motorBikes = ReadFileUtils.readFileMotorBike(PATH_MOTOR);
        MotorBike motorBike = this.infoMotorBike();
        motorBikes.add(motorBike);
        WriteFileUtils.writeFileMotorBike(PATH_MOTOR, motorBikes);


    }

    @Override
    public void displayAllMotorBike() throws IOException {
        motorBikes = ReadFileUtils.readFileMotorBike(PATH_MOTOR);
        for (MotorBike motorBike : motorBikes) {
            System.out.println(motorBike);
        }
    }

    @Override
    public void removeMotorBike() throws IOException {
        motorBikes = ReadFileUtils.readFileMotorBike(PATH_MOTOR);
        System.out.println("moi ban nhap id can xoa");
        String idMotorBike= scanner.nextLine();
        System.out.println(idMotorBike+ "id");
        System.out.println("ban co chac muon xoa khong");
        System.out.println("1.co");
        System.out.println("2. khong");
        int choice= Integer.parseInt(scanner.nextLine());
        if (choice==1) {
            for (MotorBike motorBike : motorBikes) {
                if (motorBike.getId().equals(idMotorBike)) {
                    motorBikes.remove(motorBike);
                  break;
                } else {
                    System.out.println("id khong ton tai");
                }
            }
        }
        WriteFileUtils.writeFileMotorBike(PATH_MOTOR,motorBikes);

    }

    @Override
    public void findMotorBike() {


    }


    public MotorBike infoMotorBike() {
        String idMotor;
        System.out.println("moi ban nhap id");
        idMotor = scanner.nextLine();
        String nameMotor;
        System.out.println("moi ban nhap ten san xuat");
        nameMotor = scanner.nextLine();
        String yearOfManufacture;
        System.out.println("moi ban nhap nam san xuat");
        yearOfManufacture = scanner.nextLine();
        String owner;
        System.out.println("moi ban nhap chu so huu xe may");
        owner = scanner.nextLine();
        double wattage;
        System.out.println("moi ban nhap cong suaat");
        wattage = Double.parseDouble(scanner.nextLine());
        MotorBike motorBike = new MotorBike(idMotor, nameMotor, yearOfManufacture, owner, wattage);
        return motorBike;
    }


}
