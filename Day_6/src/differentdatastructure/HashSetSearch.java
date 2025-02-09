package src.differentdatastructure;

import java.util.HashSet;

class HashSetSearch {
    private HashSet<Integer> set;

    public HashSetSearch(int[] arr) {
        set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
    }

    public boolean search(int key) {
        return set.contains(key);
    }
}
