package com.codegym.dto;

import com.codegym.model.contract.ContractDetail;
import com.codegym.model.customer.Customer;
import com.codegym.model.employee.Employee;
import com.codegym.model.facility.Facility;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Set;

public class ContractDto implements Validator {
    private Integer id;
    @NotBlank(message = "not Blank")
    private String startDate;
    @NotBlank(message = "cannot be left blank")
    private String endDate;
    @NotBlank(message = "cannot be left blank")
    private String deposit;
    private int status = 1;
    private Set<ContractDetail> contractDetails;
    @NotNull(message = "Vui lòng chọn")
    private Employee employee;
    @NotNull(message = "Vui lòng chọn")
    private Customer customer;
    @NotNull(message = "Vui lòng chọn")
    private Facility facility;


    public ContractDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ContractDto contractDto = (ContractDto) target;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate startLocalDate = null;
        LocalDate endLocalDate = null;

        try {
            startLocalDate = LocalDate.parse(contractDto.startDate, fmt);
            if (startLocalDate == null || !startLocalDate.isAfter(LocalDate.now())) {
                errors.rejectValue("startDate", "", "Ngày bắt đầu phải ở tương lai");

            }
        } catch (DateTimeException e) {
            errors.rejectValue("startDate", "", "Ngày không đúng định dạng");
        }
        try {
            endLocalDate = LocalDate.parse(contractDto.getEndDate(), fmt);
            if (endLocalDate == null || !endLocalDate.isAfter(LocalDate.now())) {
                errors.rejectValue("endDate", "", "Ngày kết thúc phải ở tương lai");
            }
        } catch (DateTimeParseException e) {
            errors.rejectValue("endDate", "", "Ngày bắt đầu không đúng định dạng DD/mm/YYYY hoặc không đúng");
        }
        if (startLocalDate == null || endLocalDate == null || !startLocalDate.isBefore(endLocalDate)) {
            errors.rejectValue("startDate", "", "Ngày bắt đầu và ngày kết thúc chưa đúng dòng thời gian");
            errors.rejectValue("endDate", "", "Ngày bắt đầu và ngày kết thúc chưa đúng dòng thời gian");
        }

        try {

            double num = Double.parseDouble(contractDto.getDeposit());
            if (num <= 0) {
                errors.rejectValue("deposit", "", "Tiền đặt cọc phải là số dương");
            }
        } catch (NumberFormatException e) {
            errors.rejectValue("deposit", "", "Tiền đặt cọc phải là một số dương");


        }
    }
}
