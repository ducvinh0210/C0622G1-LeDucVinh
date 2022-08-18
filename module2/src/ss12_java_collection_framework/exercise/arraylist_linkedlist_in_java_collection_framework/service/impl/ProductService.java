package ss12_java_collection_framework.exercise.arraylist_linkedlist_in_java_collection_framework.service.impl;

import ss12_java_collection_framework.exercise.arraylist_linkedlist_in_java_collection_framework.model.Product;
import ss12_java_collection_framework.exercise.arraylist_linkedlist_in_java_collection_framework.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new
                Product(1, "Vinh", 1234.0));
        products.add(new
                Product(2, "Vi", 3456.0));
    }


    @Override
    public void addProduct() {
        Product product = this.inforProduct();
        products.add(product);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void fixProduct() {
        Product product = this.findIdProduct();
        System.out.println("Nhap ten san pham muon doi");
        String name = scanner.nextLine();
        product.setName(name);
        System.out.println("Nhap gia san pham muon doi");
        double price = Double.parseDouble(scanner.nextLine());
        product.setPrice(price);
        System.out.println("Sua thanh cong");

    }

    @Override
    public void removeProduct() {
        Product product= this.findIdProduct();
        if(product== null){
            System.out.println("Không tìm thấy đối tượng cần xóa");
        }else {
            System.out.println("Bạn có chắc muốn xóa không");
            System.out.println("1.Có");
            System.out.println("2.Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice ==1){
                products.remove(product);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void displayAllProduct() {
        for(Product product: products){
            System.out.println(product);
        }

    }

    @Override
    public void findProduct() {
        Product product = this.findNameProduct();
        if(product!= null){
            System.out.println(product);
        }else {
            System.out.println("Tên không tồn tại");
        }

    }

    @Override
    public void sortProduct() {

    }


    public Product inforProduct() {
        System.out.println("Mời bạn nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }
    public Product findIdProduct(){
        System.out.println("Nhập vị trí bạn cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <products.size() ; i++) {
            if(products.get(i).getId()==id){
                return products.get(i);
            }

        }
return null;
    }
    public Product findNameProduct(){
        System.out.println("Mời bạn nhập tên");
        String nameProduct = scanner.nextLine();
        Product product = new Product();
        for (int i = 0; i <products.size() ; i++) {
            if(products.get(i).getName().equals(nameProduct)  ){
                product= products.get(i);
                break;
            }else {
                return null;
            }

        }
return product;
    }
}
