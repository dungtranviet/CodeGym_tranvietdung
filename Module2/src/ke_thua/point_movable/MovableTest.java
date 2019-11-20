package ke_thua.point_movable;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint mov=new MovablePoint();
        System.out.println(mov);
        mov=new MovablePoint(5.0f,11.2f);
        System.out.println(mov);
        mov=new MovablePoint(11.0f,-2.0f,1.0f,2.4f);
        System.out.println(mov);
    }
}
