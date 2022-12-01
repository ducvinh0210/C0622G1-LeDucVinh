package com.codegym.model;

import javax.persistence.*;

@Entity
public class OrderBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long code;
    private int statusCode;
    @ManyToOne
    @JoinColumn(name="book_id",referencedColumnName = "id")
    private Book book;

    public OrderBook() {
    }

    public OrderBook(int id, long code, int statusCode, Book book) {
        this.id = id;
        this.code = code;
        this.statusCode = statusCode;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
