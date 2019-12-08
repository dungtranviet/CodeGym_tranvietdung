package test;

import java.util.LinkedList;
import java.util.Queue;

public class testQueue {
    public static void main(String[] args) {
        Queue<String>waitingQueue=new LinkedList<String>();
        waitingQueue.add("An");
        waitingQueue.add("duong");
        waitingQueue.add("bao an");
        waitingQueue.add("cong");
        waitingQueue.add("cong");
        waitingQueue.add("An");
        for (String name:waitingQueue) {
            System.out.println(name);
        }
    }

}
