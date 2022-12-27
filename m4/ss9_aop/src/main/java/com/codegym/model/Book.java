package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int count;
    private  String name;
    private String author;
    @OneToMany(mappedBy = "book")
    private Set<OrderBook> orderBooks;

    public Book() {
    }

    public Book(int id, int amount, String name, String author, Set<OrderBook> orderBooks) {
        this.id = id;
        this.count = amount;
        this.name = name;
        this.author = author;
        this.orderBooks = orderBooks;
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

    public void setCount(int amount) {
        this.count = amount;
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

    public Set<OrderBook> getOrderBooks() {
        return orderBooks;
    }

    public void setOrderBooks(Set<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
    }
}
