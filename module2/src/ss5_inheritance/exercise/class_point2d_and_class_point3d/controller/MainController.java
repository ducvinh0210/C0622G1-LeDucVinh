package ss5_inheritance.exercise.class_point2d_and_class_point3d.controller;

import ss5_inheritance.exercise.class_point2d_and_class_point3d.model.Point2D;
import ss5_inheritance.exercise.class_point2d_and_class_point3d.model.Point3D;

public class MainController {
    public static void main(String[] args) {
//        Point2D point2D = new Point2D(2.0f, 3.0f);
//        System.out.println(point2D);
        Point3D point3D = new Point3D(2.0f, 3.0f, 4.0f);
        System.out.println("3D before:");
        System.out.println(point3D);
        point3D.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("3D after:");
        System.out.println(point3D);

        Point2D newPoint = new Point3D(1f, 2f, 3f);



    }
}
