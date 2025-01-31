package stackAndQueue.sortstack;
import java.util.Stack;
public class SortStackRecursively {
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {

            int top = stack.pop();

            sortStack(stack);

            insertSorted(stack, top);
        }
    }

    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base Case: If stack is empty or element is greater than top
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();

        insertSorted(stack, element);

        stack.push(top);
    }
}
