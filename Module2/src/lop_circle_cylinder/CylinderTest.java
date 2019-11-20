package lop_circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(5.0);
        System.out.println(cylinder);
        cylinder=new Cylinder(5.0,4.0,"champ");
        System.out.println(cylinder);
    }
}
