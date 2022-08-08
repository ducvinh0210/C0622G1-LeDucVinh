package ss5_inheritance.exercise.class_point2d_and_class_point3d.model;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                "x=" + super.getX() +
                "y=" + super.getY() +
                '}';
    }
}
