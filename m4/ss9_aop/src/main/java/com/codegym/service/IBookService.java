package com.codegym.service;

import com.codegym.model.Book;

import java.util.List;

public interface IBookService {

    List<Book> findAll();

    Book findById(int id);

    void save(Book book);

    Book borrowBook(Book book);

    Book returnBook(Book book);


}
