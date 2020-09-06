package part1.section1_3;

import java.util.Iterator;

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println("----------------");

        q.enqueue("wd");
        q.enqueue(123);
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println("----------------");

        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println("----------------");

        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println("----------------");


        q.enqueue("aef");
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue(3);




        for(Iterator<?> it = q.iterator(); it.hasNext();) {
            System.out.println("val: " + it.next());
        }

        q.forEach(item -> System.out.println("item: " + item));

    }


}
