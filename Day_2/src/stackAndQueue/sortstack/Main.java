package stackAndQueue.sortstack;
import java.util.Stack;

import static stackAndQueue.sortstack.SortStackRecursively.sortStack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(14);
        stack.push(9);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
