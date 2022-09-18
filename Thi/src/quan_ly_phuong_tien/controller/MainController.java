package quan_ly_phuong_tien.controller;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
   private static Scanner scanner= new Scanner(System.in);
   static CarController carController= new CarController();
  static TruckController truckController= new TruckController();
  static MotorBikeController motorBikeController= new MotorBikeController();
    public static void menuManagemnet() throws IOException {
        while (true) {
            System.out.println("moi ban den voi chung toi");
            System.out.print("1.quan ly xe oto \n" +
                    "2. quan ly xe tai\n" +
                    "3. quan ly xe may\n" +
                    "4. thoat chuong trinh\n");
            System.out.println("moi ban nhap chuc nang1-->4");
            int choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    carController.menuDisplayCar();
                    break;
                case  2:
                    truckController.menuDisplayTruck();
                    break;
                case 3:
                    motorBikeController.menuDisplayMotorBike();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("ban nhap khong dung chuc nang");
                    break;

            }


        }

    }

}
