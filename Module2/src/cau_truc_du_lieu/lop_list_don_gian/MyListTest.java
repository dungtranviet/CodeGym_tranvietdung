package cau_truc_du_lieu.lop_list_don_gian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer>list=new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("element thứ 1 :"+list.get(0));
        System.out.println("element thứ 3 :"+list.get(2));
        System.out.println("element thứ 2 :"+list.get(1));
        System.out.println("element thứ 4 :"+list.get(3));
        System.out.println("element thứ 5 :"+list.get(4));
    }
}
