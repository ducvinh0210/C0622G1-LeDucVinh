package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                updateCustomer(request, response);
                break;
            default:
                break;
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameCustomer = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int customerType = Integer.parseInt(request.getParameter("customerType"));
        Customer customer = new Customer(id,nameCustomer,dateOfBirth,gender,idCard,phone,email,address,customerType);
        boolean check = iCustomerService.edit(customer);
        Customer newCustomer = iCustomerService.findCustomerByID(id);
        request.setAttribute("customer",newCustomer);
        String mess = "Cập nhật thông tin khách hàng thành công.";

        if (!check) {
            mess = "Cập nhật thông tin khách hàng không thành công.";
        }
        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String nameCustomer = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String idCard = request.getParameter("idCard");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int customerType = Integer.parseInt(request.getParameter("customerType"));
        Customer customer = new Customer(nameCustomer,dateOfBirth,gender,idCard,phone,email,address,customerType);
        boolean check = iCustomerService.create(customer);
        String mess = "Thêm mới thành công";
        if(!check){
            mess = "Thêm mới không thành công";
        }
        request.setAttribute("mess",mess);
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "search":
                searchCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int deletedID = Integer.parseInt(request.getParameter("id"));
        iCustomerService.delete(deletedID);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("find");
        List<Customer> customers = iCustomerService.findCustomerByName(name);
        request.setAttribute("customerList",customers);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        Customer customer =  new Customer();
        int id = Integer.parseInt(request.getParameter("id"));
        customer=iCustomerService.findCustomerByID(id);
        request.setAttribute("customer",customer);
        try {
            request.getRequestDispatcher("view/customer/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = new ArrayList<>();
        Map<Integer,String> mapCustomerType = new HashMap<>();
        customerList = iCustomerService.findAll();
        mapCustomerType = iCustomerService.findAllCustomerType();
        request.setAttribute("customerList",customerList);
        request.setAttribute("mapCustomerType",mapCustomerType);
        try {
            request.getRequestDispatcher("view/customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    }

