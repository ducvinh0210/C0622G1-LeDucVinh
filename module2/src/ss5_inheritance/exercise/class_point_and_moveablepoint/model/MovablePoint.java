package ss5_inheritance.exercise.class_point_and_moveablepoint.model;

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

}

