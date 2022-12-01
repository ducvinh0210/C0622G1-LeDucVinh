package com.codegym.controller;

import com.codegym.model.Book;
import com.codegym.model.OrderBook;
import com.codegym.service.IBookService;
import com.codegym.service.IOrderBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.event.IIOReadProgressListener;
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
        ModelAndView modelAndView = new ModelAndView("book/list");
        List<Book> books = ibookService.findAll();
        modelAndView.addObject("books", books);
        return modelAndView;
    }

    @GetMapping("/view/{id}")
    public ModelAndView showDetailBook(@PathVariable int id) {
        Book book = ibookService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/book/view");
      modelAndView.addObject("book",book);
      return modelAndView;

    }
    @GetMapping("/order/{id}")
    public ModelAndView orderBook(@PathVariable int id) throws Exception {
        Book book=ibookService.findById(id);
        Book validBook= ibookService.borrowBook(book);
        if (validBook== null){
            throw new Exception();
        }
        OrderBook  orderBook= iOrderBookService.generateOrderBook(validBook);
        iOrderBookService.save(orderBook);
        ModelAndView modelAndView= new ModelAndView("/book/view");
        modelAndView.addObject("book",validBook);
        modelAndView.addObject("code",orderBook.getCode());
        return modelAndView;
    }

}
