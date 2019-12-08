package test;

import java.util.Queue;
import java.util.Stack;

public class testStack {
    public static void main(String[] args) {
        Stack st=new Stack();
        System.out.println("Stack "+st);
        showPush(st,1);
        showPush(st,2);
        showPush(st,3);
        showPush(st,4);
        showPush(st,5);
        showPop(st);
        showPop(st);
        showPop(st);
        showPop(st);
        showPop(st);
    }
    static void showPush(Stack st, int a){
        System.out.println("Push("+a+")");
        st.push(a);
        System.out.println("Stack "+st);
    }
    static void showPop(Stack st){
        System.out.println("Pop----->"+st.pop());
        System.out.println("Stack "+st);
    }
}
