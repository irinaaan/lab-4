public class RightTriangle {
    private double base;
    private double height;

    RightTriangle(double base, double height) { //constructor
        this.base = base;
        this.height = height;
    }

    RightTriangle() { //constructor used when no dimensions specified
        base = 0;
        height = 0;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    double area() { // compute and return volume
        return base * height;
    }

    double hypotenuse() { // compute and return hypotenuse
        return Math.sqrt(((base * base) + (height * height)));
    }

    double perimeter() { // compute and return perimeter
        return hypotenuse() + base + height;
    }

   public void printInfo() {
        System.out.println("Base: " + getBase() + ". Height: " + getHeight() + ". Square: " + area() + ". Hypotenuse: " + hypotenuse() + ". Perimeter: " + perimeter());
   }
}