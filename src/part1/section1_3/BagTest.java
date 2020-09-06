package part1.section1_3;

import java.util.Iterator;

public class BagTest {
    public static void main(String[] args) {
        Bag b = new Bag();
        System.out.println("isEmpty: " + b.isEmpty());
        System.out.println("size: " + b.size());
        b.add(1);
        b.add(2);
        b.add(3);
        b.add("4");

        System.out.println("isEmpty: " + b.isEmpty());
        System.out.println("size: " + b.size());

        for(Iterator<?> it = b.iterator(); it.hasNext();) {
            System.out.println("val: " + it.next());
        }
        System.out.println("-----------------");
        b.forEach(item -> System.out.println("item: " + item));
    }
}
