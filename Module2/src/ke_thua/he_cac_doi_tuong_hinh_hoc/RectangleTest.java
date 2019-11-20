package ke_thua.he_cac_doi_tuong_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(5.2,4.0);
        System.out.println(rectangle);
        rectangle=new Rectangle(5.2,4.0,"xam",false);
        System.out.println(rectangle);
    }
}
