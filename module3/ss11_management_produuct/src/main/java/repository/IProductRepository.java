package repository;

import model.Product;

import java.beans.Customizer;
import java.util.List;

public interface IProductRepository {
List<Product> findAll();
void save(Product product);
Product findById(int id);
void update(int id, Product product);
void remove(int id);
List<Product> searchByName(String name);



}
