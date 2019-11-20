package ke_thua.shape_triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        double area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
        return area;
    }

    public double getPrimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    @Override
    public String toString() {
        return "a triangle with 3 side :side1= " + this.getSide1() + " , side2= " + this.getSide2() + " , side3= " + this.getSide3() +
                ",which of area =" + this.getArea() +" and a subclass of "+super.toString();
    }
}
