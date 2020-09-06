package part1.section1_3;

import java.util.Iterator;

public class Bag<T> implements Iterable<T>{
    private Node first;
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

    public void add(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
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
