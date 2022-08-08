package ss5_inheritance.exercise.class_point_and_moveablepoint.model;
import java.util.Arrays;
public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(){

    }
    public MovablePoint(float xSpeed, float ySpeed, float x,float y){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed= ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed( float xSpeed, float ySpeed){
        this.xSpeed= xSpeed;
        this.ySpeed= ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }
//    public MovablePoint move(){
//        super.setX(this.getX()+getxSpeed());
//        super.setY(this.getY()+getySpeed());
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return "MovablePoint{" +
//                "xSpeed=" + xSpeed +
//                ", ySpeed=" + ySpeed +
//                "x ="+ super.getX()+
//                "y ="+ super.getY()+
//                '}';
//    }
public MovablePoint move() {
    setX(getX() + this.xSpeed);
    setY(getY() + this.ySpeed);
    return this;
}

    @Override
    public String toString() {
        return super.toString() + ", speed = " + Arrays.toString(getSpeed());
    }

}

