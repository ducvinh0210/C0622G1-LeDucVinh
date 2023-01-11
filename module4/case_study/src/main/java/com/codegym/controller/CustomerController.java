package com.codegym.controller;

import com.codegym.dto.CustomerDto;
import com.codegym.dto.IContractDetailDto;
import com.codegym.model.customer.Customer;
import com.codegym.model.customer.CustomerType;
import com.codegym.service.IContractDetailService;
import com.codegym.service.ICustomerService;
import com.codegym.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @Autowired
    private IContractDetailService contractDetailService;




    @ModelAttribute("customerTypeList")
    List<CustomerType> getCustomerTypes() {
        return customerTypeService.findAll();
    }

    @GetMapping("")
    public ModelAndView showCustomers(@RequestParam(value = "nameSearch", defaultValue = "") String nameSearch,
                                      @RequestParam(value = "email", defaultValue = "") String email,
                                      @RequestParam(value = "customerType", defaultValue = "") String customerType,
                                      @PageableDefault(value = 3) Pageable pageable) {
        Page<Customer> customers = customerService.findByNameAndEmailAndCustomerType(nameSearch, email, customerType, pageable);
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customers);
        modelAndView.addObject("nameSearch", nameSearch);
        modelAndView.addObject("email", email);
        modelAndView.addObject("customerType", customerType);
        return modelAndView;

    }

    @GetMapping("/create")
    public ModelAndView createCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customerDto", new CustomerDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView acceptCreateCustomer(@ModelAttribute @Validated CustomerDto customerDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("/customer/create");
            return modelAndView;
        } else {

            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            ModelAndView modelAndView = new ModelAndView("/customer/create");
            modelAndView.addObject("customerDto2", customerDto);
            modelAndView.addObject("message", "New customer successfuly");
            return modelAndView;

        }
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam(value = "idDelete") int id, RedirectAttributes redirectAttributes) {
        customerService.remove(id);
        redirectAttributes.addFlashAttribute("message", "Delete customer successfully");
        return "redirect:/customers";

    }

    @GetMapping("/edit/{id}")
    public ModelAndView editCustomer(@PathVariable int id) {
        Optional<Customer> optionalCustomer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        if (!optionalCustomer.isPresent()) {
            modelAndView.addObject("message", "Customer not found");
            return modelAndView;
        }
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(optionalCustomer.get(), customerDto);
        List<CustomerType> customerTypeList = customerTypeService.findAll();
        modelAndView.addObject("customerDto", customerDto);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView acceptEditCustomer(@ModelAttribute @Validated CustomerDto customerDto, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            return modelAndView;

        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customerDto", customerDto);
            modelAndView.addObject("message", "edit customer successfully");
            return modelAndView;

        }
    }

    @GetMapping("/using")
    public String searchCustomerUsingService(@RequestParam(value = "nameSearch", defaultValue = "") String nameSearch,
                                             @RequestParam(value = "email", defaultValue = "") String email,
                                             @RequestParam(value = "customerType", defaultValue = "") String customerType,
                                             Model model,
                                             @PageableDefault(value = 3) Pageable pageable) {
        Page<Customer> customers = customerService.findCustomerUsingService(nameSearch, email, customerType, pageable);
        model.addAttribute("customers", customers);
        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("email", email);
        model.addAttribute("customerType", customerType);
        return "/customer/customers_use_service";
    }

    @GetMapping("/{id}/using")
    public ResponseEntity<List<IContractDetailDto>> getContractDetails(@PathVariable int id) {
        List<IContractDetailDto> contractDetailAttachFacilityDtos = contractDetailService.findByCustomer(id);
        System.out.println(contractDetailAttachFacilityDtos.toString());
        if (contractDetailAttachFacilityDtos.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(contractDetailAttachFacilityDtos, HttpStatus.OK);
    }
}
