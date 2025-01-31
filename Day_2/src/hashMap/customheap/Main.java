package hashMap.customheap;

public class Main {
    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        System.out.println("Value for key 1: " + hashMap.get(1)); // Output: 10
        hashMap.remove(1);
        System.out.println("Value for key 1 after removal: " + hashMap.get(1)); // Output: -1
    }
}
