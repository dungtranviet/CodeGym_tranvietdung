package ke_thua.shape_triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        System.out.println(triangle);
        triangle=new Triangle(10,17,21);
        System.out.println(triangle);
        triangle=new Triangle(10,17,21,"blue",false);
        System.out.println(triangle);
    }
}
