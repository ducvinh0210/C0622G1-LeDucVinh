package ss5_inheritance.exercise.class_circle_and_class_cylinder.controller;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;
import ss5_inheritance.exercise.class_circle_and_class_cylinder.model.Circle;
import ss5_inheritance.exercise.class_circle_and_class_cylinder.model.Cylinder;

public class MainController {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(4.0,5.0,"red");
        System.out.println( cylinder);

    }




}
