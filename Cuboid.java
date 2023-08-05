//Exercise 2
public class Cuboid extends Rectangle{
    // write your code here
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
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
        return (area * height);
    }
}