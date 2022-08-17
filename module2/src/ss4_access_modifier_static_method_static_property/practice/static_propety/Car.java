package ss4_access_modifier_static_method_static_property.practice.static_propety;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCar;
 public Car(String name, String engine) {
     this.name = name;
     this.engine = engine;
     numberOfCar++;

 }
}
