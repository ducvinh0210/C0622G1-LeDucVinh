package com.codegym.service.impl;

import com.codegym.model.Book;
import com.codegym.repository.BookRepository;
import com.codegym.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);

    }

    @Override
    public Book borrowBook(Book book) {
        if (book.getCount() > 0) {
            book.setCount(book.getCount() - 1);
            return book;
        }
        return null;


    }

    @Override
    public Book returnBook(Book book) {
        book.setCount(book.getCount() + 1);
        return book;
    }
}
