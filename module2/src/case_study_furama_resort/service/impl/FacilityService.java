package case_study_furama_resort.service.impl;

import case_study_furama_resort.model.Booking;
import case_study_furama_resort.model.Facility;
import case_study_furama_resort.model.Villa;
import case_study_furama_resort.service.IFacilityService;
import case_study_furama_resort.utils.exception.InfoFacilityException;
import case_study_furama_resort.utils.read_write.ReadAndWriteFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static Map<Facility, Integer> facilityMaintainList = new LinkedHashMap<>();

    @Override
    public void displayFacility() {

    }

    @Override
    public void addFacility() {

    }

    @Override
    public void displayFacilityMaintain() {

    }

    @Override
    public void maintainFacility() {

    }

    private Facility addNewVilla() {
        String idService;
        while (true) {
            try {
                System.out.println("nhap id phong");
                idService = scanner.nextLine();
                if (!idService.matches("^[0-9]{4}$")) {
                    throw new NumberFormatException("khong dung dinh dang");

                }
                idService="SVVL-"+idService;
                if (findServiceId(idService)){
                    throw new InfoFacilityException("khong dung dinh dang");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            }

        }
        double area;
        while (true) {
            try {
                System.out.println("nhap dien tich villa");
                area = Double.parseDouble(scanner.nextLine());
                if (area < 30) {
                    throw new InfoFacilityException("khong nhap dung ding dang");
                }
                break;
            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
double price;
        while (true){
            try{
                System.out.println("nhap gia thue");
                price= Double.parseDouble(scanner.nextLine());
                if(price<=0){
                    throw  new InfoFacilityException("Ban nhap khong dung dinh dang");
                }
                break;
            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
        int numberOfPeople;
        while (true){
            try {
                System.out.println("nhap so nguoi su dung");
                numberOfPeople= Integer.parseInt(scanner.nextLine());
            if(numberOfPeople<0||numberOfPeople>20){
                throw new InfoFacilityException("ban nhap khong dung");

            }break;
            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
String style;
        while (true){
            try{
                System.out.println("nhap kieu thue");
                style= scanner.nextLine();
                if(!style.matches("\\D{3,20}")||!style.matches("^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$")){
                throw new InfoFacilityException("nhap khong dung dinh dang");
                }
                break;

            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
        }
        }
String roomStandard;
        while (true){
            try {
                System.out.println("nhap tieu chuan phong");
                roomStandard= scanner.nextLine();
                if (!roomStandard.matches("\\D{3,20}") || !roomStandard.matches("^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$")) {
                    throw new InfoFacilityException("not valid information, please reenter");
                }
                break;
            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
double lakeArea;
        while (true){
            try {
                System.out.println("nhap dien tich ho boiw");
                lakeArea= Double.parseDouble(scanner.nextLine());
                if (lakeArea<30){
                    throw new InfoFacilityException("nhap khong dung");

                }
                break;
            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            }
        }
int numberOfFloors;
        while (true){
            try {
                System.out.println("nhap so tang");
                numberOfFloors= Integer.parseInt(scanner.nextLine());
                if (numberOfFloors<0||numberOfFloors>10){
                    throw new InfoFacilityException("nhap khong dung");

                }break;
            } catch (InfoFacilityException e) {
                System.out.println(e.getMessage());
            }
        }
        Facility villaFurama=new Villa(idService,"VillaFurama",area,price,numberOfPeople,style,roomStandard,
                lakeArea,numberOfFloors);
        return villaFurama;












    }
    private boolean findServiceId(String id){
        Set<Facility> facilitySet=facilityList.keySet();
        for (Facility facility:facilitySet){
            if (facility.getServiceCode().equals(id)){
                return true;
            }
        }
        return false;
    }


//    public static final String PATH_FACILITY = "src\\case_study_furama_resort\\data\\facilityFile.csv";
//    private static Scanner scanner = new Scanner(System.in);
//    private static Map<Facility, Integer> facilityList = new LinkedHashMap<>();
//
//
//    @Override
//    public void displayFacility() {
//        facilityList = ReadAndWriteFacility.readFacilityFile(PATH_FACILITY);
//        Set<Facility> facilitySet = facilityList.keySet();
//        for (Facility facility : facilitySet) {
//            System.out.println(facility + ", Số lân dùng" + facilityList.get(facility));
//        }
//
//    }
//
//    @Override
//    public void addFacility() {
//        facilityList = ReadAndWriteFacility.readFacilityFile(PATH_FACILITY);
//        while (true) {
//            System.out.println("Bạn muốn thêm loại cơ sở:");
//            System.out.println("1.Thêm mới Villa");
//            System.out.println("2.Thêm mới House");
//            System.out.println("3.Thêm mới Room");
//            System.out.println("4.Trở về menu chính");
//
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    Facility villa = this.inforVilla();
//                    System.out.println("số lần dùng");
//                    int numberOfUseVilla = Integer.parseInt(scanner.nextLine());
//                    facilityList.put(villa, numberOfUseVilla);
//                    break;
//                case 4:
//                    return;
//
//                default:
//                    System.out.println("ban nhap khong dung");
//                    break;
//            }
//
//        }
//    }
//
//    @Override
//    public void displayFacilityMaintenance() {
//        facilityList = ReadAndWriteFacility.readFacilityFile(PATH_FACILITY);
//        Set<Facility> facilitySet = facilityList.keySet();
//        for (Facility facility : facilitySet
//        ) {
//            if (facilityList.get(facility) > 5) {
//                System.out.println(facility + "so lan dung" + facilityList.get(facility));
//            }
//
//        }
//    }
//
//    public Facility inforVilla() {
//        String idVilla;
//        while (true) {
//            try {
//                System.out.println("Mời bạn nhập mã Villa");
//                idVilla = scanner.nextLine();
//                if (!idVilla.matches("[0-9]{4}")) {
//                    throw new NumberFormatException("Bạn nhập không hợp lệ");
//                }
//                idVilla = "SVVL-" + idVilla;
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//
//        String nameVilla;
//        while (true) {
//            try {
//                System.out.println("Mời bạn nhập tên");
//                nameVilla = scanner.nextLine();
//                if (!nameVilla.matches("[A-Z][a-z]+")) {
//                    throw new NumberFormatException("Ban nhạp không đúng định dạng");
//                }
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//        }
//
//        double areaVilla;
//        while (true){
//            try{
//                System.out.println("Moi ban nhap dien tich villa");
//                areaVilla = Double.parseDouble(scanner.nextLine());
//                if(areaVilla<30){
//                    throw new NumberFormatException("ban nhap khong dung dinh dang");
//
//                }
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        double priceVilla;
//        while (true){
//            try{
//                System.out.println("Moi ban nhap gia thue villa");
//                priceVilla = Double.parseDouble(scanner.nextLine());
//                if (priceVilla<0){
//                    throw new NumberFormatException("Ban nhap khong dung dinh dang");
//                }
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//        }
//
//        int numberOfPeople;
//        while (true){
//            try {System.out.println("Moi ban nhap so luong nguoi o toi da");
//                numberOfPeople = Integer.parseInt(scanner.nextLine());
//                if(numberOfPeople<0||numberOfPeople>20){
//                    throw new NumberFormatException("Ban nhap khong dung dinh dang");
//                }
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//        }
//        String style;
//        while (true){
//            try {
//                System.out.println("Mời bạn nhập kiểu thuê theo năm,tháng,ngày");
//                style = scanner.nextLine();
//                if(!style.equals("Năm")&&!style.equals("Tháng")&&!style.equals("Ngày")){
//                    throw new NumberFormatException("Bạn nhập định dạng không đúng");
//                }
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        String roomStandard;
//        while (true){
//            try {
//                System.out.println("Nhập bạn nhập tiểu chuẩn phòng");
//                roomStandard = scanner.nextLine();
//                if(!roomStandard.matches("[A-Z][a-z]+")){
//                    throw new NumberFormatException("Ban nhap khong dung dinh dang");
//                }
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        double lakeArea;
//        while (true){
//            try {System.out.println("Mời bạn nhập diện tích hồ bơi của villa");
//                lakeArea = Double.parseDouble(scanner.nextLine());
//                if (lakeArea<=30){
//                    throw new NumberFormatException("ban nhap sai dinh dang");
//                }
//                break;
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }
//
//        int numberOfFloors;
//     while (true){
//         try    { System.out.println("Moi ban nhap so tang cua villa can thue");
//             numberOfFloors = Integer.parseInt(scanner.nextLine());
//             if(numberOfFloors<0){
//                 throw new  NumberFormatException("ban nhap khong dung ding dang");
//             }
//             break;
//         } catch (NumberFormatException e) {
//             e.printStackTrace();
//         }catch (Exception e){
//             System.out.println(e.getMessage());
//         }
//     }
//
//        Facility villaFurama = new Villa(idVilla, nameVilla, areaVilla, priceVilla,
//                numberOfPeople, style, roomStandard, lakeArea, numberOfFloors);
//        return villaFurama;
//    }


}











