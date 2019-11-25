package cau_truc_du_lieu;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list=new MyList<>();
        System.out.println(list.add(10));
        System.out.println(list.add(11));
        System.out.println(list.add(12));
        list.remove(0);
        System.out.println("kích thước của list là "+list.size());
        MyList<Integer> clone=  list.clone();
        clone.add(123);
        System.out.println("kích thước của clone là "+clone.size());
        System.out.println("clone có chưa 123 ?"+clone.contains(123));
        System.out.println("list có chưa 123 ?"+list.contains(123));
        System.out.println("vị trí index của phần tử 123 trong clone là "+clone.indexOf(123));
        System.out.println("vị trí index của phần tử 123 trong list là "+list.indexOf(123));
        list.ensureCapacity(13);
        System.out.println("phần tử lại vị trí index = 2 của clone là : "+clone.get(2));
        System.out.println("phần tử lại vị trí index = 2 của list là : "+list.get(2));
        list.clear();
        clone.clear();
        System.out.println("kích thước của list sau khi clear : "+list.size());
        System.out.println("kích thước của clone sau khi clear :"+clone.size());
        System.out.println("phần tử lại vị trí index = 2 của clone là : "+clone.get(2));
        System.out.println("phần tử lại vị trí index = 2 của list là : "+list.get(2));
    }
}
