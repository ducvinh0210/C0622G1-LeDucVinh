package ss6_adstract_class_interface.exercise.interface_colorable.controller;

import ss6_adstract_class_interface.exercise.interface_colorable.model.Shape;
import ss6_adstract_class_interface.exercise.interface_colorable.model.Square;

public class MainController {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0]= new Square(5.0);

    }
}
