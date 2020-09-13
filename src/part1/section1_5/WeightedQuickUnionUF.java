package part1.section1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class WeightedQuickUnionUF {
    private int[] id; // array of parent node
    private int[] sz; // array of root node
    private int count; // count of connected components

    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public Boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        // follow link to find root node
        while(p != id[p]) {
           p = id[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if(i == j) {
            return;
        }
        // link smaller tree to bigger tree
        if(sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    public static void main(String[] args) {
        int N = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(N);
        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p, q)) {
               continue;
            }
            uf.union(p, q);
            StdOut.println(uf.count() + "components");
        }
    }
}
