package ss5_inheritance.exercise.class_point_and_moveablepoint.controller;

import ss5_inheritance.exercise.class_point_and_moveablepoint.model.MovablePoint;

public class MainController {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3.4f,5.6f,4,4);
        System.out.println(movablePoint);
        movablePoint.move() ;
        System.out.println(movablePoint);
    }


}
