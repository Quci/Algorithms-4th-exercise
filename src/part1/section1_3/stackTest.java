package part1.section1_3;

import java.util.Iterator;

public class stackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println("isEmpty: " + s.isEmpty());
        System.out.println("size: " + s.size());
        s.push("dfd");
        s.push(007);
        s.push(996);
        s.push(955);
        System.out.println("isEmpty: " + s.isEmpty());
        System.out.println("size: " + s.size());
        System.out.println("pop: " + s.pop());
        System.out.println("isEmpty: " + s.isEmpty());
        System.out.println("size: " + s.size());
        for(Iterator<?> it = s.iterator(); it.hasNext();) {
            System.out.println("val: " + it.next());
        }

        s.forEach(item -> System.out.println("item: " + item));
    }
}
