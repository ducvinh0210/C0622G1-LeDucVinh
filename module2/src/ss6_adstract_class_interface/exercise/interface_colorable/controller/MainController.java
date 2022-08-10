package ss6_adstract_class_interface.exercise.interface_colorable.controller;

import ss6_adstract_class_interface.exercise.interface_colorable.model.*;

public class MainController {
    public static void main(String[] args) {
       Shape[] shapes = new Shape[3];
       shapes[0] = new Circle(5.0);
       shapes[1] = new Rectangle(5.0, 7.0);
       shapes[2] = new Square(6.0);

        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Colorable){
                System.out.println(shapes[i].howToColor());

            }else {
                System.out.println(shapes[i].getArea());
            }

        }


    }
}
