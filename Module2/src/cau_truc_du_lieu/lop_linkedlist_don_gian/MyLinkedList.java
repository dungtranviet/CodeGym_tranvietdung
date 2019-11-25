package cau_truc_du_lieu.lop_linkedlist_don_gian;

public class MyLinkedList {
    private Node head;
    private int numberNodes;
    public MyLinkedList() {

    }
    public MyLinkedList(Object data) {
      this.head=new Node(data);
      this.numberNodes=1;
      this.head.next=null;
    }
    public void addFirst(Object data){
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numberNodes++;
    }
    public void add(int index,Object data){
        Node temp=this.head;
        int i;
        for( i=0;temp.next!=null&&i<index-1;i++){
            temp=temp.next;
        }
        if (i==index-1) {
            Node newNode=new Node(data);
            newNode.next=temp.next;
            temp.next=newNode;
            numberNodes++;
        }
        else {
            System.out.println("không thể thêm vào tại index này");
        }
    }
    public Node get(int index){
        Node temp=head;
        int i;
        for( i=0;temp.next!=null&&i<index;i++){
         temp=temp.next;
        }
        if (i==index) {
            return temp;
        }
        else {
            return null;
        }
    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.getNode());
            temp=temp.next;
        }
    }
}
