package hao;

public class BinarySearchRecursion {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] whiteList = new int[]{1, 5, 23, 34, 45, 56, 66, 74, 88, 90, 94, 667};
        System.out.println("66 index is: " + rank(66, whiteList));
        System.out.println("23 index is: " + rank(23, whiteList));
        System.out.println("667 index is: " + rank(667, whiteList));
        System.out.println("667 index is: " + rank(3, whiteList));
    }
}

