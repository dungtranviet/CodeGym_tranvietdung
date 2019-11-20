package lop_circle_cylinder;

public class Cylinder extends Circle{
    double height=2.0;
    public Cylinder(){}
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return this.getArea()*this.height;
    }
    @Override
    public String toString(){
        return "a cylinder with height= "+this.height+" and which is a subclass of "+super.toString();
    }
}
