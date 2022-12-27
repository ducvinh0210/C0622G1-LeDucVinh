package com.codegym.controller;

import com.codegym.model.Book;
import com.codegym.model.OrderBook;
import com.codegym.service.IBookService;
import com.codegym.service.IOrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService ibookService;

    @Autowired
    private IOrderBookService iOrderBookService;

    @GetMapping("")
    public ModelAndView showBook() {
        ModelAndView modelAndView = new ModelAndView("/book/list");
        List<Book> books = ibookService.findAll();
        modelAndView.addObject("books", books);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView showDetailBook(@PathVariable int id) {
        Book book = ibookService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/book/view");
        modelAndView.addObject("book", book);
        return modelAndView;

    }

    @GetMapping("/order/{id}")
    public ModelAndView orderBook(@PathVariable int id) throws Exception {
        Book book = ibookService.findById(id);
        Book validBook = ibookService.borrowBook(book);
        if (validBook == null) {
            throw new Exception();
        }
        OrderBook orderBook = iOrderBookService.generateOrderBook(validBook);
        iOrderBookService.save(orderBook);
        ModelAndView modelAndView = new ModelAndView("/book/view");
        modelAndView.addObject("book", validBook);
        modelAndView.addObject("code", orderBook.getCode());
        return modelAndView;
    }

    @GetMapping("/return/{id}")
    public ModelAndView returnBook(@PathVariable int id) {
        Book book = ibookService.findById(id);
        OrderBook orderBook = new OrderBook();
        ModelAndView modelAndView = new ModelAndView("book/return");
        modelAndView.addObject("book", book);
        modelAndView.addObject("orderBook", orderBook);
        return modelAndView;

    }

    @PostMapping("/return")
    public ModelAndView acceptBook(@RequestParam int id, @ModelAttribute OrderBook orderBook) {
        OrderBook orderBookFindByCode = iOrderBookService.findOrderBookByCode(orderBook.getCode(), id);
        Book book = ibookService.findById(id);

        if (orderBookFindByCode != null) {
            book = ibookService.returnBook(book);
            ibookService.save(book);
            iOrderBookService.deleteBookCode(orderBookFindByCode.getCode());
            ModelAndView modelAndView = new ModelAndView("/book/return");
            modelAndView.addObject("mess", "return book successfully");
            modelAndView.addObject("book", book);
            modelAndView.addObject("orderBook", orderBookFindByCode);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/book/return");
            modelAndView.addObject("mess", "valid code");
            modelAndView.addObject("book", book);
            modelAndView.addObject("orderBook", new OrderBook());
            return modelAndView;

        }
    }

    @ExceptionHandler(Exception.class)
    public String handleError() {
        return "/book/error";
    }


}
