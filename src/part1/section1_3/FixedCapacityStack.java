package part1.section1_3;
import java.util.Iterator;

public class FixedCapacityStack<T> implements Iterable<T>{
    private T[] a; // stack entries
    private int N; // size

    public FixedCapacityStack() {
        a = (T[]) new Object[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(T item) {
        if(N == a.length) {
            resize(a.length * 2);
        }
        a[N++] = item;
    }

    public T pop() {
        T item = a[--N];
        a[N] = null; // gc
        if(N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    public void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for(int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int i = N;
        public boolean hasNext() {
            return i > 0;
        }

        public T next() {
            return a[--i];
        }

        public void remove() {

        }
    }
}
