package cau_truc_du_lieu;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    static private final int DEFAULT_CAPACITY=10;
    private Object []elements;
    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        this.elements=new Object[capacity];
    }
    public void ensureCAPA(){
        int newSize=this.elements.length*2;
        this.elements= Arrays.copyOf(this.elements,newSize);
    }
    public void add(int index,E e){
        this.elements[index]=e;
        this.size++;
    }
    public boolean add(E e){
        if (size==elements.length) {
            ensureCAPA();
        }
        elements[size++]=e;
        return true;
    }
    public E remove(int index){
        if(index<size){
            Object e=elements[index];
            for (int i=index;i<size;i++) {
                elements[i]=elements[i+1];
            }
            this.size--;
            return (E) e;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
    public int size(){
        return this.size;
    }
    public MyList<E> clone(){
        MyList<E> clone=new MyList<>();
        for (int i=0;i<this.size;i++) {
            clone.add((E)elements[i]);
        }
        return  clone;
    }
    public boolean contains(E o){
        for (Object element:elements) {
            if(o.equals((E)element)){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i=0;i<size;i++) {
            E element=(E)elements[i];
            if(o.equals(element)){
                return i;
            }
        }
        return -1;
    }
    public void ensureCapacity(int minCapacity){
        if(elements.length<minCapacity){
            elements=Arrays.copyOf(elements,minCapacity);
        }
    }
    public E get(int index){
        if(0<=index&&index<size){
            return (E)elements[index];
        }
        else {
            return null;
        }
    }
    public void clear(){
        this.elements=new Object[DEFAULT_CAPACITY];
        size=0;
    }
}
