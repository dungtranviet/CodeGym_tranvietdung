package advanced_object_oriented_design.resizeable;

public class ResizeInterfaceTest {
    public static void main(String[] args) {
        Shape []shapes=new Shape[3];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(5,10);
        shapes[2]=new Square(5);
        System.out.println("thông tin và diện tích của các hình trước khi tăng kích thước :");
        for (Shape shape:shapes) {
            System.out.println(shape.toString());
        }
        System.out.println("thông tin và diện tích của các hình sau khi tăng kích thước :");
        for (Shape shape:shapes) {
            int random=(int)Math.floor(Math.random()*100);
            shape.Resize(random);
            System.out.println(shape.toString());
        }
    }
}
