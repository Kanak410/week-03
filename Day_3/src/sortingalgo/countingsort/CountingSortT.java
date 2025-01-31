package sortingalgo.countingsort;

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortT {

    public static void countingSort(int arr[]) {
        int min = 10, max = 18; // The age range is from 10 to 18
        int range = max - min + 1;

        // Step 1: Create a count array and initialize it with 0
        int count[] = new int[range];

        // Step 2: Store the frequency of each element in the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Step 3: Compute cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Build the output array
        int output[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Step 5: Copy the sorted elements back into the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input: Ages of the students with validation
        System.out.println("Enter the ages of the students (between 10 and 18): ");
        boolean isValidInput = true;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            // Validate that the age is between 10 and 18
            if (arr[i] < 10 || arr[i] > 18) {
                System.out.println("Invalid input! Age should be between 10 and 18. Please enter again.");
                isValidInput = false;
                break; // Exit the loop if invalid input is found
            }
        }

        if (isValidInput) {
            // Sorting the ages using Counting Sort
            countingSort(arr);
            // Output: Sorted ages
            System.out.println("Sorted Student Ages:");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Exiting the program due to invalid input.");
        }

        sc.close(); // Close the scanner
    }
}
