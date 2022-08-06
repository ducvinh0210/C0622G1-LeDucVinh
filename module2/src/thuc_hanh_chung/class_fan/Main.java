package thuc_hanh_chung.class_fan;



public class Main {public static void main(String[] args) {
    ClassFan fan = new ClassFan();
    fan.setSpeed(2);
    fan.setOn(true);
    fan.setRadius(10);
    fan.setColor("Yelow");
    System.out.println(fan.toString());
}
}
