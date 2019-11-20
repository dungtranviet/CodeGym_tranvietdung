package ke_thua.he_cac_doi_tuong_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        square=new Square(5);
        System.out.println(square);
        square=new Square(5,"orengy",false);
        System.out.println(square);
    }
}
