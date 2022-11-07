package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {

    private static Map<Integer, Customer> customers = new HashMap<>();

    static {
        customers.put(1, new Customer(1, "john", "john@codegym.vn", "ha noi"));
        customers.put(2, new Customer(2, "vinh", "vinh@codegym.vn", "quang nam"));
        customers.put(3, new Customer(3, "vi", "vi@codegym.vn", "viet nam"));
        customers.put(4, new Customer(4, "thanh", "thanh@codegym.vn", "quang nam"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer byFindId(int id) {
        return customers.get(id);

    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);

    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
