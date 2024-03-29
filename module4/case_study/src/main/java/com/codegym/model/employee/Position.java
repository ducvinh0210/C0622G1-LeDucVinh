package com.codegym.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "int default 1")
    private int status=1;
    @OneToMany(mappedBy = "position")
    private Set<Employee>  employees;

    public Position() {
    }

    public Position(Integer id, String name, int status, Set<Employee> employees) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.employees = employees;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
