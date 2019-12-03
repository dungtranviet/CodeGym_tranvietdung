package TesCompe.Comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(12);
        tree.add(34);
        tree.add(34);
        tree.add(12);

        Iterator iterator = tree.iterator();
        System.out.print("Tree set data: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
