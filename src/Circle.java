public class Circle {
    private double x; //center coordinates( x and y )
    private double y;
    private double radius;

    Circle(double x, double y, double radius) { //constructor
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    Circle() { //constructor used when no dimensions specified
        x = 0;
        y = 0;
        radius = 0;
    }


    Circle(double x, double y) { //constructor when radius is 0
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double volume() { //compute and return volume
        return Math.PI * radius * radius;
    }

    double length() { //compute and return length
        return 2 * Math.PI * radius;
    }

    public void printInfo() {
        System.out.println("Radius: " + getRadius() + ". X: " + getX() + ". Y: " + getY() + ". Volume: " + volume() + ". Length: " + length());
    }
}