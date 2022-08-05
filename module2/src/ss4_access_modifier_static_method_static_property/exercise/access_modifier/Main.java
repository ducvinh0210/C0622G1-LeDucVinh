package ss4_access_modifier_static_method_static_property.exercise.access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setRadius(2);
        circle.setColor("blue");
        Circle circl1 = new Circle(3,"blue");
        System.out.println(circl1);
    }
}
