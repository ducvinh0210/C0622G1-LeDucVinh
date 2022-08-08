package ss5_inheritance.exercise.class_point_and_moveablepoint.controller;

import ss5_inheritance.exercise.class_point_and_moveablepoint.model.MovablePoint;

public class MainController {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(7.0f,2.5f,9,8);
        System.out.println(movablePoint);
        movablePoint.move() ;
        System.out.println(movablePoint);
    }


}
