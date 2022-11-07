package repository;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Iphone 12", 12000, "ĐANG SALE", "Apple"));
        products.put(2, new Product(2, "Iphone 13", 13000, "CHUẨN BỊ SALE", "Apple"));
        products.put(3, new Product(3, "Iphone14", 14000, "ĐANG HOT", "Apple"));
        products.put(4, new Product(4, "Iphone14 Promax", 15000, "RẤT HOT, CHÁY HÀNG", "Apple"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());

    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);


    }

    @Override
    public Product findById(int id) {
        return products.get(id);

    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);


    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getName().contains(name)) {
                productList.add(product);
            }
        }
        return productList;

    }
}
