package src.differentdatastructure;

import java.util.TreeSet;

class TreeSetSearch {
    private TreeSet<Integer> treeSet;

    public TreeSetSearch(int[] arr) {
        treeSet = new TreeSet<>();
        for (int num : arr) {
            treeSet.add(num);
        }
    }

    public boolean search(int key) {
        return treeSet.contains(key);
    }
}
