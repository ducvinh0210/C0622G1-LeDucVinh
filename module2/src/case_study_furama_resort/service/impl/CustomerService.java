package case_study_furama_resort.service.impl;

import case_study_furama_resort.model.Customer;
import case_study_furama_resort.service.ICustomerService;
import case_study_furama_resort.utils.exception.IdException;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customers = new LinkedList<>();

//    static {
//        customers.add(new
//                Customer("KH001", "Le Duc Vinh", "22/11/2000", "Nam", 122333, 959595, "ledvinh@gmail.com", "Diamond", "viet nam"));
//        customers.add(new
//                Customer("KH002", "Pham thi vi", "2/10/1998", "Nu", 111111, 33333, "phamthivi@gmail.com", "Diamond", "vietnam"));
//    }

    @Override
    public void displayAllCustomer() {
        for (Customer customer : customers
        ) {
            System.out.println(customer);

        }
    }

    @Override
    public void addCustomer() {
        Customer customer = this.inforCustomer();
        customers.add(customer);
        System.out.println("Them moi thanh cong");
    }

    @Override
    public void editCustomer() {
        System.out.println("Nhap id khach hang can sua");
        String id = scanner.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(id)) {
                customers.set(i, inforCustomer());
            }

        }
        System.out.println("Sua thông tin khách hàng thành công");
    }

    /**
     * thông tin thêm mới khách hàng
     *
     * @return về khách hàng mới cần thêm vào
     */


    public Customer inforCustomer() {
        String idCustomer;
        while (true) {
            try {
                System.out.println("Mời bạn nhập mã khách hàng");
                idCustomer = scanner.nextLine();
                for (Customer customer : customers) {
                    if (customer.getId().equals(idCustomer)) {
                        throw new IdException("ID khách hàng đã tồn tại mời nhập lại");
                    }
                }
                break;
            } catch (IdException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Bạn nhập không hợp lệ");
            }
        }

        String name;
        System.out.println("mời nhập tên khách hàng");
        name = scanner.nextLine();
        String dateOfBirth;
        System.out.println("mời nhập ngày sinh khách hàng");
        dateOfBirth = scanner.nextLine();
        String gender;
        System.out.println("Nhập giới tính của khách hàng");
        gender = scanner.nextLine();
        int identityCard;
        System.out.println("Nhập số chứng minh nhân dân của khách hàng");
        identityCard = Integer.parseInt(scanner.nextLine());
        int numberPhone;
        System.out.println("Nhập số điện thoại của khách hàng");
        numberPhone = Integer.parseInt(scanner.nextLine());
        String email;
        System.out.println("Nhập email của khách hàng");
        email = scanner.nextLine();
        String typeOfGuest;
        while (true) {
            try {
                System.out.println("Mời bạn nhập loại khách hàng\n1.Kim cương\n2.platinium\n3.vàng\n4.bạc\n5.thành viên");
                typeOfGuest = scanner.nextLine();
                if (!typeOfGuest.equals("Kim cương") && !typeOfGuest.equals("Plalinium") && !typeOfGuest.equals("Vàng") && !typeOfGuest.equals("Bạc")) {
                    throw new IdException("ban nhap loai khach hang khong dung");

                }
                break;

            } catch (IdException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("ban nhap khong hop le");
            }
        }
        String address;
        System.out.println(" moi ban nhap dia chi khach hang");
        address = scanner.nextLine();

        Customer customer = new Customer(idCustomer, name, dateOfBirth, gender, identityCard, numberPhone, email, typeOfGuest, address);
        return customer;

    }

    public Customer findCustomer() {
        System.out.println("mời bạn nhập id khách hàng");
        String id = scanner.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(id)) {
                return customers.get(i);
            }

        }
        return null;
    }
}
