package part1.section1_3;
import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
    private Node first; // first in node
    private Node last; // last in node
    private int N;

    private class Node<T> {
        T item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(T item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public T dequeue() {
        T item = (T) first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    public Iterator<T> iterator() {
        return new ReverseIterator();
    }

    private class ReverseIterator implements Iterator<T> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T item = (T) current.item;
            current = current.next;
            return item;
        }

        public void remove() {

        }
    }
}
