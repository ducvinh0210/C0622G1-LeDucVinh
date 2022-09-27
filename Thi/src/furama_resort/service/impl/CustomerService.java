package furama_resort.service.impl;

import furama_resort.model.Customer;
import furama_resort.model.Employee;
import furama_resort.service.ICustomerService;
import furama_resort.utils.exception.CheckException;
import furama_resort.utils.exception.InfomationException;
import furama_resort.utils.read_write_file.ReadFileUtils;
import furama_resort.utils.read_write_file.WriteFileUtils;
import quan_ly_phuong_tien.service.ITruckService;
import sun.nio.cs.ext.ISO2022_CN_CNS;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    public static final String CUSTOMER_PATH = "src\\furama_resort\\data\\customerFile.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customers = new LinkedList<>();


    @Override
    public void displayAllCustomer() throws IOException {
        customers = ReadFileUtils.readFileCustomer(CUSTOMER_PATH);
        for (Customer customer : customers) {
            System.out.println(customer);
        }

    }

    @Override
    public void addCustomer() throws IOException {
        customers = ReadFileUtils.readFileCustomer(CUSTOMER_PATH);
        Customer customer = this.infoCustomer();
        customers.add(customer);
        WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);

    }

    @Override
    public void editCustomer() throws IOException {
        customers = ReadFileUtils.readFileCustomer(CUSTOMER_PATH);
        Customer customerToEdit = this.findCustomer();
        if (customerToEdit == null) {
            System.out.println("không tìm thấy đối tượng cần sửa");
        } else {
            while (true) {
                System.out.println("Bạn muốn sửa thông tin nhân viên tất cả hay chi tiết");
                System.out.println("1. Sửa tất cả");
                System.out.println("2. Sửa chi tiết");
                System.out.println("3. thoát ra menu");
                System.out.println("mời bạn nhập chức năng 1-->3");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        String idCustomer;
                        while (true) {
                            try {
                                System.out.println("Nhập id nhân viên muốn thay đổi");
                                idCustomer = scanner.nextLine();
                                break;


                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        String nameCustomer;
                        while (true) {
                            try {
                                System.out.println("Nhập tên nhân viên muốn thay đổi");
                                nameCustomer = scanner.nextLine();
                                if (!nameCustomer.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                                    throw new NumberFormatException("ban nhap khong dung dinh dang");

                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        LocalDate dateOfBirthCustomer;
                        while (true) {
                            try {
                                System.out.println("nhập ngày thán năm sinh theo định dạng dd-MM-yyyy");
                                dateOfBirthCustomer = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                                CheckException.checkDateOfBirth(dateOfBirthCustomer);
                                break;


                            } catch (DateTimeParseException e) {
                                System.out.println("Định dạng ngày tháng năm dd-MM-yyyy ");
                            } catch (InfomationException e) {
                                System.out.println(e.getMessage());
                            }

                        }
                        String gender = "";
                        while (true) {
                            try {
                                boolean check = true;
                                System.out.println("Mời bạn chọn giới tính");
                                System.out.println("1. Nam");
                                System.out.println("2. Nữ");
                                System.out.println("3. Giới tính thứ 3");
                                System.out.println("Mời bạn nhập từ 1-->3");
                                int choiceGender = Integer.parseInt(scanner.nextLine());
                                switch (choiceGender) {
                                    case 1:
                                        gender = "Nam";
                                        check = true;
                                        break;
                                    case 2:
                                        gender = "Nữ";
                                        check = true;
                                        break;
                                    case 3:
                                        gender = "Giới tính thứ 3";
                                        check = true;
                                        break;
                                    default:
                                        System.out.println("bạn nhập không đúng chức năng");
                                        break;
                                }
                                if (check) {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Bạn nhập không đúng");
                            }


                        }
                        String identityCard;
                        while (true) {
                            try {
                                System.out.println("Mời bạn số chứng minh nhân dân");
                                identityCard = scanner.nextLine();
                                if (!identityCard.matches("[0-9]{11}")) {
                                    throw new NumberFormatException("Bạn nhập không đúng định dạng, bạn nhập dạng số gồm 11 số");
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                                ;
                            }
                        }
                        String phoneNumber;
                        while (true) {
                            try {
                                System.out.println("mời bạn nhập số điện thoại của nhân viên");
                                phoneNumber = scanner.nextLine();
                                if (!phoneNumber.matches("[0][9][0-9]{8}")) {
                                    throw new NumberFormatException("Bạn nhập không đúng, số điện thoại gồm 10 số, bắt đầu là 09");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String email;
                        while (true) {
                            try {
                                System.out.println("mời bạn nhập email nhân viên");
                                email = scanner.nextLine();
                                if (!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                                    throw new NumberFormatException("Bạn nhập không đúng ");
                                }
                                break;

                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        String typeOfCustomer = "";
                        while (true) {
                            try {
                                boolean check = true;
                                System.out.println("mời bạn chọn loại khách hàng");
                                System.out.println("1.Diamond");
                                System.out.println("2.Plainium");
                                System.out.println("3.Gold");
                                System.out.println("4.Silver");
                                System.out.println("5.Member");
                                System.out.println("nhập chức năng 1-->5");
                                int choice2 = Integer.parseInt(scanner.nextLine());
                                switch (choice2) {
                                    case 1:
                                        typeOfCustomer = "Diamond";
                                        check = true;
                                        break;
                                    case 2:
                                        typeOfCustomer = "Plainium";
                                        check = true;
                                        break;
                                    case 3:
                                        typeOfCustomer = "Gold";
                                        check = true;
                                        break;
                                    case 4:
                                        typeOfCustomer = "Silver";
                                        check = true;
                                        break;
                                    case 5:
                                        typeOfCustomer = "Member";
                                        check = true;
                                        break;
                                    default:
                                        System.out.println("ban nhap khong dung dinh dang");
                                        break;

                                }
                                if (check) {
                                    break;
                                }

                            } catch (NumberFormatException e) {
                                System.out.println("ban nhap khong dung");
                            }
                        }
                        String addressCustomer;
                        while (true) {
                            try {
                                System.out.println("Mời bạn nhập địa chỉ khách hàng");
                                addressCustomer = scanner.nextLine();
                                break;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                        customerToEdit.setId(idCustomer);
                        customerToEdit.setName(nameCustomer);
                        customerToEdit.setDateOfBirth(dateOfBirthCustomer);
                        customerToEdit.setGender(gender);
                        customerToEdit.setIdentityCard(identityCard);
                        customerToEdit.setPhoneNumber(phoneNumber);
                        customerToEdit.setEmail(email);
                        customerToEdit.setTypeOfCustomer(typeOfCustomer);
                        customerToEdit.setAddress(addressCustomer);
                        WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                        break;
                    case 2:
                        customers = ReadFileUtils.readFileCustomer(CUSTOMER_PATH);

                        System.out.println("bạn muốn sửa chức năng");
                        System.out.println("1. Sửa id khách hàng\n" +
                                "2. Sửa tên khách hàng\n" +
                                "3. Sửa ngày sinh khách hàng\n" +
                                "4. Sửa giới tính khách hàng\n" +
                                "5. Sửa số CMND khách hàng\n" +
                                "6. Sửa số điện thoại khách hàng\n" +
                                "7. Sửa Email khách hàng\n" +
                                "8. Sửa loại khách hàng\n" +
                                "9. Sửa địa chỉ khách hang\n" +
                                "10.exit\n");
                        System.out.println("mời bạn nhập chức năng 1-->10");
                        int choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                String codeCustomer;
                                while (true) {
                                    try {
                                        System.out.println("Nhập id khách hàng muốn thay đổi");
                                        codeCustomer = scanner.nextLine();
                                        break;


                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                                customerToEdit.setId(codeCustomer);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;
                            case 2:
                                String nameCustomer1;
                                while (true) {
                                    try {
                                        System.out.println("Nhập tên nhân viên muốn thay đổi");
                                        nameCustomer1 = scanner.nextLine();
                                        if (!nameCustomer1.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                                            throw new NumberFormatException("ban nhap khong dung dinh dang");

                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                customerToEdit.setName(nameCustomer1);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;
                            case 3:

                                LocalDate dateOfBirthCustomer1;
                                while (true) {
                                    try {
                                        System.out.println("nhập ngày thán năm sinh theo định dạng dd-MM-yyyy");
                                        dateOfBirthCustomer1 = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                                        CheckException.checkDateOfBirth(dateOfBirthCustomer1);
                                        break;


                                    } catch (DateTimeParseException e) {
                                        System.out.println("Định dạng ngày tháng năm dd-MM-yyyy ");
                                    } catch (InfomationException e) {
                                        System.out.println(e.getMessage());
                                    }

                                }
                                customerToEdit.setDateOfBirth(dateOfBirthCustomer1);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;
                            case 4:


                                String genderCustomer = "";
                                while (true) {
                                    try {
                                        boolean check = true;
                                        System.out.println("Mời bạn chọn giới tính");
                                        System.out.println("1. Nam");
                                        System.out.println("2. Nữ");
                                        System.out.println("3. Giới tính thứ 3");
                                        System.out.println("Mời bạn nhập từ 1-->3");
                                        int choiceGender = Integer.parseInt(scanner.nextLine());
                                        switch (choiceGender) {
                                            case 1:
                                                genderCustomer = "Nam";
                                                check = true;
                                                break;
                                            case 2:
                                                genderCustomer = "Nữ";
                                                check = true;
                                                break;
                                            case 3:
                                                genderCustomer = "Giới tính thứ 3";
                                                check = true;
                                                break;
                                            default:
                                                System.out.println("bạn nhập không đúng chức năng");
                                                break;
                                        }
                                        if (check) {
                                            break;
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Bạn nhập không đúng");
                                    }


                                }
                                customerToEdit.setGender(genderCustomer);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;
                            case 5:

                                String identityCardCustomer;
                                while (true) {
                                    try {
                                        System.out.println("Mời bạn số chứng minh nhân dân");
                                        identityCardCustomer = scanner.nextLine();
                                        if (!identityCardCustomer.matches("[0-9]{11}")) {
                                            throw new NumberFormatException("Bạn nhập không đúng định dạng, bạn nhập dạng số gồm 11 số");
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());

                                    }
                                }
                                customerToEdit.setIdentityCard(identityCardCustomer);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;
                            case 6:

                                String phoneNumberCustomer;

                                while (true) {
                                    try {
                                        System.out.println("mời bạn nhập số điện thoại của nhân viên");
                                        phoneNumberCustomer = scanner.nextLine();
                                        if (!phoneNumberCustomer.matches("[0][9][0-9]{8}")) {
                                            throw new NumberFormatException("Bạn nhập không đúng, số điện thoại gồm 10 số, bắt đầu là 09");
                                        }
                                        break;

                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                customerToEdit.setPhoneNumber(phoneNumberCustomer);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;
                            case 7:

                                String emailCustomer;
                                while (true) {
                                    try {
                                        System.out.println("mời bạn nhập email nhân viên");
                                        emailCustomer = scanner.nextLine();
                                        if (!emailCustomer.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                                            throw new NumberFormatException("Bạn nhập không đúng ");
                                        }
                                        break;

                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                customerToEdit.setEmail(emailCustomer);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;
                            case 8:
                                String typeOfCustomer1 = "";
                                while (true) {
                                    try {
                                        boolean check = true;
                                        System.out.println("mời bạn chọn loại khách hàng");
                                        System.out.println("1.Diamond");
                                        System.out.println("2.Plainium");
                                        System.out.println("3.Gold");
                                        System.out.println("4.Silver");
                                        System.out.println("5.Member");
                                        System.out.println("nhập chức năng 1-->5");
                                        int choice3 = Integer.parseInt(scanner.nextLine());
                                        switch (choice3) {
                                            case 1:
                                                typeOfCustomer1 = "Diamond";
                                                check = true;
                                                break;
                                            case 2:
                                                typeOfCustomer1 = "Plainium";
                                                check = true;
                                                break;
                                            case 3:
                                                typeOfCustomer1 = "Gold";
                                                check = true;
                                                break;
                                            case 4:
                                                typeOfCustomer1 = "Silver";
                                                check = true;
                                                break;
                                            case 5:
                                                typeOfCustomer1 = "Member";
                                                check = true;
                                                break;
                                            default:
                                                System.out.println("ban nhap khong dung dinh dang");
                                                break;

                                        }
                                        if (check) {
                                            break;
                                        }

                                    } catch (NumberFormatException e) {
                                        System.out.println("ban nhap khong dung");
                                    }
                                }
                                customerToEdit.setTypeOfCustomer(typeOfCustomer1);
                                WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                                break;

                    case 9:
                        String addressCustomer1;
                        while (true) {
                            try {
                                System.out.println("Mời bạn nhập địa chỉ khách hàng");
                                addressCustomer1 = scanner.nextLine();
                                break;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        customerToEdit.setAddress(addressCustomer1);
                        WriteFileUtils.writeFileCustomer(CUSTOMER_PATH, customers);
                        break;
                    case 10:
                        return;
                    default:
                        System.out.println("ban nhap khong dung");
                        break;


                }
                case 3:
                    return;

            }
        }
    }

}

    public Customer infoCustomer() {
        String idCustomer;
        while (true) {
            try {
                System.out.println("Mời bạn nhập id nhân viên");
                idCustomer = scanner.nextLine();
                for (Customer customer : customers) {
                    if (customer.getId().equals(idCustomer)) {
                        throw new InfomationException("Id đã trùng, mời bạn nhập lại");

                    }

                }
                break;
            } catch (InfomationException e) {
                System.out.println(e.getMessage());
            }
        }

        String nameCustomer;
        while (true) {
            try {
                System.out.println("Mời bạn nhập tên nhân viên");
                nameCustomer = scanner.nextLine();
                if (!nameCustomer.matches("^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$")) {
                    throw new NumberFormatException("Bạn nhập không đúng, mời bạn nhập lại");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        LocalDate dateOfBirth;
        while (true) {
            try {
                System.out.println("nhập ngày thán năm sinh theo định dạng dd-MM-yyyy");
                dateOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                CheckException.checkDateOfBirth(dateOfBirth);
                break;


            } catch (DateTimeParseException e) {
                System.out.println("Định dạng ngày tháng năm dd-MM-yyyy ");
            } catch (InfomationException e) {
                System.out.println(e.getMessage());
            }

        }
        String gender = "";
        while (true) {
            try {
                boolean check = true;
                System.out.println("Mời bạn chọn giới tính");
                System.out.println("1. Nam");
                System.out.println("2. Nữ");
                System.out.println("3. Giới tính thứ 3");
                System.out.println("Mời bạn nhập từ 1-->3");
                int choiceGender = Integer.parseInt(scanner.nextLine());
                switch (choiceGender) {
                    case 1:
                        gender = "Nam";
                        check = true;
                        break;
                    case 2:
                        gender = "Nữ";
                        check = true;
                        break;
                    case 3:
                        gender = "Giới tính thứ 3";
                        check = true;
                        break;
                    default:
                        System.out.println("bạn nhập không đúng chức năng");
                        break;
                }
                if (check) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng");
            }


        }
        String identityCard;
        while (true) {
            try {
                System.out.println("Mời bạn số chứng minh nhân dân");
                identityCard = scanner.nextLine();
                if (!identityCard.matches("[0-9]{11}")) {
                    throw new NumberFormatException("Bạn nhập không đúng định dạng, bạn nhập dạng số gồm 11 số");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                ;
            }
        }
        String phoneNumber;
        while (true) {
            try {
                System.out.println("mời bạn nhập số điện thoại của nhân viên");
                phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("[0][9][0-9]{8}")) {
                    throw new NumberFormatException("Bạn nhập không đúng, số điện thoại gồm 10 số, bắt đầu là 09");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String email;
        while (true) {
            try {
                System.out.println("mời bạn nhập email nhân viên");
                email = scanner.nextLine();
                if (!email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                    throw new NumberFormatException("Bạn nhập không đúng ");
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String typeOfCustomer = "";
        while (true) {
            try {
                boolean check = true;
                System.out.println("mời bạn chọn loại khách hàng");
                System.out.println("1.Diamond");
                System.out.println("2.Plainium");
                System.out.println("3.Gold");
                System.out.println("4.Silver");
                System.out.println("5.Member");
                System.out.println("nhập chức năng 1-->5");
                int choice2 = Integer.parseInt(scanner.nextLine());
                switch (choice2) {
                    case 1:
                        typeOfCustomer = "Diamond";
                        check = true;
                        break;
                    case 2:
                        typeOfCustomer = "Plainium";
                        check = true;
                        break;
                    case 3:
                        typeOfCustomer = "Gold";
                        check = true;
                        break;
                    case 4:
                        typeOfCustomer = "Silver";
                        check = true;
                        break;
                    case 5:
                        typeOfCustomer = "Member";
                        check = true;
                        break;
                    default:
                        System.out.println("ban nhap khong dung dinh dang");
                        break;

                }
                if (check) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("ban nhap khong dung");
            }
        }
        String addressCustomer;
        while (true) {
            try {
                System.out.println("Mời bạn nhập địa chỉ khách hàng");
                addressCustomer = scanner.nextLine();
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Customer customer = new Customer(idCustomer, nameCustomer, dateOfBirth, gender, identityCard,
                phoneNumber, email, typeOfCustomer, addressCustomer);
        return customer;

    }

    public Customer findCustomer() {
        System.out.println("nhập id khách hàng cần tìm");
        String idCustomer = scanner.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(idCustomer)) {
                return customers.get(i);
            }
        }
        return null;
    }

}
