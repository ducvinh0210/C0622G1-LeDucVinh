package com.codegym.aspect;

import org.aspectj.lang.annotation.AfterThrowing;

public class BookAspect {
    private static long count;
    @AfterThrowing("execution(* com.codegym.controller.BookController.orderBook(..)")
    public void checkOder(){
        System.out.println("___________________");
        System.out.println("không còn sách để mượn");
    }

}
