package ss3_class_and_object_in_java.bai_tap.class_fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean status;
    double radius;
    String color;

    public Fan() {
        this.speed = SLOW;
        this.status = false;
        this.radius = 10;
        this.color = "blue";
    }


    public int getSpeed() {
        return this.speed;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return this.radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }


    @Override
    public String toString() {
        if (getStatus()) {
            return "Fan is on " +
                    "Fan{" +
                    "speed=" + speed +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan is off " +
                    "Fan{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
