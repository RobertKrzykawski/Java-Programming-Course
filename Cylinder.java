//Exercise 1
public class Cylinder extends Circle{
    // write your code here
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        if (height < 0) {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        double area = getArea();
        return area * height;
    }
}