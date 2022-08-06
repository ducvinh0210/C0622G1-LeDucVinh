package ss3_class_and_object_in_java.bai_tap.class_quadratic_equation;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public double getRoot1() {
        this.getDiscriminant();
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2*this.a);
    }

    public double getRoot2() {
        this.getDiscriminant();
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2*this.a);
    }

    public double getRoot0() {
        return -this.b / (2 * this.a);
    }
}
