package cau_truc_du_lieu.lop_list_don_gian;

import java.util.Arrays;

public class MyList<S> {
    private int size=0;
    private final int DEFAULT_DEPACITY=10;
    Object elements[];
    public MyList(){
        elements=new Object[DEFAULT_DEPACITY];
    }
    public void ensureCAPA(){
        int newsize=elements.length*2;
        elements= Arrays.copyOf(elements,newsize);
    }
    public void add(S e){
        if (size==elements.length) {
            ensureCAPA();
        }
        elements[size++]=e;
    }
    public S get(int i){
        if (i<0||i>=size) {
            throw new IndexOutOfBoundsException("index "+i+",size "+i);
        }
        return (S) elements[i];
    }
}
