package src.differentdatastructure;

class ArraySearch {
    public boolean search(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) return true;
        }
        return false;
    }
}
