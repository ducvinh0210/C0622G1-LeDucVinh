package ss4_access_modifier_static_method_static_property.practice.static_propety;

public class Main {
    public static void main(String[] args) {
            Car car1 = new Car("Mazda 3", " tubo 2.0");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda CX5","tubo 3.0");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Vinfast lux A2.0","tubo 4.0");
        System.out.println(Car.numberOfCar);
    }
}
