package hao;

import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whiteList = new int[]{1, 5, 23, 34, 45, 56, 66, 74, 88, 90, 94, 667};
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = rank(key, whiteList);
            StdOut.println(index);
        }
    }
}
