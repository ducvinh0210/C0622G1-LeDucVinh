package ss5_inheritance.practince.controller;

import ss5_inheritance.practince.model.Circle;
import ss5_inheritance.practince.model.Rectangle;
import ss5_inheritance.practince.model.Shape;
import ss5_inheritance.practince.model.Square;

public class MainController {
    public static void main(String[] args) {
        Shape shape =   new Shape();
        System.out.println( shape);
        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);

        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(3.5,"blue",false);
        System.out.println(circle1);


        Rectangle rectangle = new Rectangle(3.0,4.0,"yelow",true);
        System.out.println(rectangle);

        Square square= new Square(2.3);
        Square square1= new Square(4.5,"black",true);
        System.out.println( square);
        System.out.println(square1);




    }




}
