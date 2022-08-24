package ss17_io_binary_serialization.exercise.product_management;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacture;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String manufacture, double score) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", score=" + price +
                '}';
    }
}
