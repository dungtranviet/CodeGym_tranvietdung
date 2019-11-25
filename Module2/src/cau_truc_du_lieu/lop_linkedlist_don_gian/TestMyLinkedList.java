package cau_truc_du_lieu.lop_linkedlist_don_gian;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList=new MyLinkedList(5);
        linkedList.add(1,12);
        linkedList.add(2,13);
        linkedList.add(1,11);
        linkedList.add(3,10);
        linkedList.addFirst(100);
        linkedList.printList();
        System.out.println("giá trị index =0 :"+linkedList.get(0).getNode());
        System.out.println("giá trị index =12 :"+linkedList.get(12).getNode());
    }
}
