package hashMap.customheap;

import java.util.LinkedList;

class MyHashMap {
    private static final int SIZE = 1000;
    private LinkedList<Entry>[] buckets;

    static class Entry {
        int key, value;
        Entry(int k, int v) {
            key = k;
            value = v;
        }
    }

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Entry entry : buckets[index]) {
            if (entry.key == key) {
                entry.value = value;  // Update value if key exists
                return;
            }
        }
        buckets[index].add(new Entry(key, value));  // Insert new key-value pair
    }

    public int get(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            for (Entry entry : buckets[index]) {
                if (entry.key == key) {
                    return entry.value;  // Return value
                }
            }
        }
        return -1;  // Key not found
    }

    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(entry -> entry.key == key);  // Remove key if found
        }
    }


}

