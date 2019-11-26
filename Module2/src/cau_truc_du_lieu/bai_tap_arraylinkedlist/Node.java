package cau_truc_du_lieu.bai_tap_arraylinkedlist;

public class Node {
    public Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }
    public Object get(){
        return this.data;
    }
}
