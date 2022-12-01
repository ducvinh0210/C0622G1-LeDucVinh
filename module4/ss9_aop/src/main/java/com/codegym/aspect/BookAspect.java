package com.codegym.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookAspect {
    private static long count;
    @AfterThrowing("execution(* com.codegym.controller.BookController.orderBook(..)")
    public void checkOrder(){
        System.out.println("___________________");
        System.out.println("không còn sách để mượn");
    }
@After("execution(* com.codegym.controller.BookController.orderBook(..)")
    public void longOrderDone(){
    System.out.println("___________________________");
    System.out.println("mượn sách thành công");

}
    @After("execution(* com.codegym.controller.BookController.returnBook(..)")
    public void loggerPay(){
        System.out.println("_________________");
        System.out.println("Trả sách thành công");
    }
@After("execution(* com.codegym.controller.BookController.*(..))")
    public void logAfterMethodBookController(JoinPoint joinPoint){
        count++;
        String nameMethod= joinPoint.getSignature().getName();
    System.out.println("___________________________");
    System.out.println("Người truy cập phương thức "+nameMethod+ "vào lúc "+ LocalDateTime.now());
    System.out.println("Số lượng truy cập "+count);
}
}
