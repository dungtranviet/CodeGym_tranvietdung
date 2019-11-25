package cau_truc_du_lieu.lop_linkedlist_don_gian;

public class Node {
    private int nextNode;
    private Object data;
    public Node next;
    public Node() {
    }
    public Node(Object data) {
        this.data = data;
    }
    public Object getNode(){
       return this.data;
    }
}
