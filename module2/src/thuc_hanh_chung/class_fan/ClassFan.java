package thuc_hanh_chung.class_fan;

public class ClassFan {

        final int SLOW = 1;
        final int MEDIUM =2;
        final  int FASt=3;
        private int speed ;
        private boolean on ;
        private double radius;
        private String color;
        public ClassFan(){
            this.speed=SLOW;
            this.on = false;
            this.radius= 5;
            this.color="Red";
        }

        public int getSpeed() {
            return speed;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "ClassFan{" +
                    "SLOW=" + SLOW +
                    ", MEDIUM=" + MEDIUM +
                    ", FASt=" + FASt +
                    ", speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }


