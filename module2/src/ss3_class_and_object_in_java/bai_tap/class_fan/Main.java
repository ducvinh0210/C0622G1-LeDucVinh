package ss3_class_and_object_in_java.bai_tap.class_fan;

public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setStatus(true);
        fan1.setColor("Yellow");
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setStatus(false);
        fan2.setColor("Blue");
        Fan fanDefault = new Fan();
        System.out.println("Fan 1: \n" + fan1.toString());
        System.out.println("Fan 2: \n" + fan2.toString());
        System.out.println("Fan 3: \n" + fanDefault.toString());

    }
}
