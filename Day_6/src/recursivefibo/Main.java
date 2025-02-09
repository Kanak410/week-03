package src.recursivefibo;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fibonacci index (N): ");
        int n = scanner.nextInt();
        scanner.close();

        Recursive recursiveFib = new Recursive();
        Iterative iterativeFib = new Iterative();

        // Measure Recursive Fibonacci Time
        long startTime = System.currentTimeMillis();
        int recursiveResult = recursiveFib.fibonacci(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Recursive Fibonacci Result: " + recursiveResult);
        System.out.println("Time taken (Recursive): " + (endTime - startTime) + "ms");

        // Measure Iterative Fibonacci Time
        startTime = System.currentTimeMillis();
        int iterativeResult = iterativeFib.fibonacci(n);
        endTime = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci Result: " + iterativeResult);
        System.out.println("Time taken (Iterative): " + (endTime - startTime) + "ms");
    }
}
