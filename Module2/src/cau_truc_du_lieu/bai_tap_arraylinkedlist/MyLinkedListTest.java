package cau_truc_du_lieu.bai_tap_arraylinkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList=new MyLinkedList<>();
        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);
        myList.add(0,5);
        int a=myList.remove(0);
        System.out.println(a);
        System.out.println("kích thước list : "+myList.size());
        boolean isAvailabe=myList.remove(new Integer(1));
        System.out.println("xóa được không ?: "+isAvailabe);
        System.out.println("kích thước list : "+myList.size());
        MyLinkedList<Integer> cloneList=myList.clone();
        System.out.println("kích thước list : "+myList.size());
        System.out.println("kích thước clone list : "+cloneList.size());
        isAvailabe=myList.remove(new Integer(4));
        System.out.println("xóa được 1 trong list không ?: "+isAvailabe);
        System.out.println("kích thước list : "+myList.size());
        System.out.println("kích thước clone list : "+cloneList.size());
        System.out.println("các phần tử trong list ");
        myList.printList();
        System.out.println("phần tử đầu tiên trong list:"+myList.getFirst());
        System.out.println("phân tử cuối cùng có trong list :"+myList.getLast());
        System.out.println("các phần tử trong clone list ");
        cloneList.printList();
        System.out.println("phần tử đầu tiên có trong clone list "+cloneList.getFirst());
        System.out.println("phần tử cuối cùng trong clone list :"+cloneList.getLast());
        System.out.println("có 4 trong list ? "+ myList.contains(4));
        System.out.println("có 4 trong clone list ? "+ cloneList.contains(4));
        System.out.println("vị trí của 2 trong list "+ myList.indexOf(2));
        System.out.println("vị trí của 4 trong clone list :"+cloneList.indexOf(4));
        System.out.println("sau khi clear hết ");
        myList.clear();
        System.out.println("phần tử đầu tiên trong list:"+myList.getFirst());
        System.out.println("phân tử cuối cùng có trong list :"+myList.getLast());
        System.out.println("các phần tử trong clone list ");
        myList.printList();
        cloneList.clear();
        System.out.println("phần tử đầu tiên có trong clone list "+cloneList.getFirst());
        System.out.println("phần tử cuối cùng trong clone list :"+cloneList.getLast());
    }
}
