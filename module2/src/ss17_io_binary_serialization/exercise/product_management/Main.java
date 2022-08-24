package ss17_io_binary_serialization.exercise.product_management;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products =new ArrayList<>();
        products.add(new Product(1,"Vinfast luxA2.0","Vinfast",1233));
        products.add(new Product(2,"Mazda 3 Luxury","Mazda",12344));
        products.add(new Product(3,"maybach s450","mecerdes",32434));
        products.add(new Product(4,"Audi A4","Audi",34353));
writeToFile("src\\ss17_io_binary_serialization\\exercise\\product_management\\productFile.txt",products);
List<Product>productsDataFromFile= readDataFromFile("src\\ss17_io_binary_serialization\\exercise\\product_management\\productFile.txt");
        for (Product product:productsDataFromFile
             ) {
            System.out.println(product);

        }

    }




    /**
     * ghi vao file
     * @param path
     * @param products
     */
    public static void writeToFile(String path, List<Product>products){
    try {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(products);
        objectOutputStream.close();
        fileOutputStream.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

/**
 * doc tu file
 */
public static List<Product> readDataFromFile(String path){
    List<Product> products= new ArrayList<>();
    try {
        FileInputStream fileInputStream= new FileInputStream(path);
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        products = (List<Product>) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
return products;

}
}
