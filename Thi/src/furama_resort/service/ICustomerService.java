package furama_resort.service;

import java.io.IOException;

public interface ICustomerService {
    void displayAllCustomer() throws IOException;

    void addCustomer() throws IOException;

    void editCustomer() throws IOException;

}
