package com.codegym.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int count;
    private String name;
    private String author;
    @OneToMany(mappedBy = "book")
    private List<OrderBook> orders;

    public Book() {
    }

    public Book(int id, int count, String name, String author, List<OrderBook> orders) {
        this.id = id;
        this.count = count;
        this.name = name;
        this.author = author;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<OrderBook> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderBook> orders) {
        this.orders = orders;
    }
}
