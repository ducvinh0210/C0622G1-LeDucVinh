package ss5_inheritance.exercise.class_circle_and_class_cylinder.model;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getRadius()*super.getRadius()*Math.PI*height;
       // return  super.getArea()*height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height:"
                + getHeight()
                +super.toString();
    }
}


