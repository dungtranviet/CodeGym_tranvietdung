package cau_truc_du_lieu.bai_tap_arraylinkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {

    }

    public MyLinkedList(E data) {
        head = new Node(data);
        head.next = null;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data){
        Node temp=head;
        if(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
        numNodes++;
    }
    public void add(int index, Object data) {
        if (index == 0) {
          addFirst(data);
        } else if (0 < index && index < numNodes) {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            Node newNode=new Node(data);
            newNode.next=temp.next;
            temp.next=newNode;
            numNodes++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
    public E remove(int index){
        if(index==0){
            Node holder=head;
            head=head.next;
            numNodes--;
            return (E) holder.get();
        }
        else if(index<numNodes){
            Node temp=head;
            for (int i=0;i<index-1;i++) {
                temp=temp.next;
            }
            Node holder=temp.next;
            temp.next=temp.next.next;
            numNodes--;
            return (E) holder.get();
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
    public boolean remove(Object data){
        Node temp=head;
        if(head.get().equals(data)){
            head=head.next;
            numNodes--;
            return true;
        }
        while (temp.next!=null) {
            if(temp.next.get().equals(data)){
                temp.next=null;
                numNodes--;
                return  true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int size(){
        return this.numNodes;
    }
    public MyLinkedList<E> clone(){
        MyLinkedList<E> cloneList=new MyLinkedList<>();
        Node temp=head;
        cloneList.addFirst(temp.get());
        temp=temp.next;
        while (temp!=null) {
            cloneList.addLast(temp.get());
            temp=temp.next;
        }
        return cloneList;
    }
    public boolean contains(E e){
        Node temp=head;
        while (temp!=null){
            if(temp.get().equals(e)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.get());
            temp=temp.next;
        }
    }
    public int indexOf(E e){
        Node temp=head;
        int index=0;
        while (temp!=null){
            if(temp.get().equals(e)){
                return index;
            }
            temp=temp.next;
            index++;
        }
        return index;
    }
    public E getFirst(){
        if(head==null){
            return null;
        }
        return (E) head.get();
    }
    public E getLast(){
        if(head==null){
            return null;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        return (E) temp.get();
    }
    public void clear(){
        this.head=null;
        this.numNodes=0;
    }
}
