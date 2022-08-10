package ss6_adstract_class_interface.exercise.inerface_Resizeable.controller;

import ss6_adstract_class_interface.exercise.inerface_Resizeable.model.Circle;
import ss6_adstract_class_interface.exercise.inerface_Resizeable.model.Rectangle;
import ss6_adstract_class_interface.exercise.inerface_Resizeable.model.Shape;
import ss6_adstract_class_interface.exercise.inerface_Resizeable.model.Square;

public class MainController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes [0] = new Circle(5.0);
        shapes[1]= new Rectangle(7.5,10);
        shapes[2]= new Square(10.5);
        for(Shape shape: shapes){
            shape.resize(Math.floor(Math.random()*100));
        }
        for(Shape shape:shapes){
            System.out.println(shape);
            System.out.println();
        }
    }
}
