package stackAndQueue.CircularTour;

public class findStartingPoint {
    public static int findStartingPoint(int[] petrol, int[] distance) {
    int totalSurplus = 0;  // Total petrol - total distance
    int currentSurplus = 0; // Petrol balance while traveling
    int startIndex = 0;  // Possible starting index

        for (int i = 0; i < petrol.length; i++) {
        int netGain = petrol[i] - distance[i];
        totalSurplus += netGain;
        currentSurplus += netGain;

        // If current surplus drops below zero, reset the starting index
        if (currentSurplus < 0) {
            startIndex = i + 1;
            currentSurplus = 0;
        }
    }

    // If total surplus petrol is negative, no possible solution
        return (totalSurplus >= 0) ? startIndex : -1;
  }

public static void main(String[] args) {
    int[] petrol = {4, 6, 7, 4};  // Petrol at each pump
    int[] distance = {6, 5, 3, 5};  // Distance to next pump

    int start = findStartingPoint(petrol, distance);
    System.out.println("Starting Petrol Pump Index: " + start);
 }
}
