package stackAndQueue.implementQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        QueueUsingTwoStacks queue=new QueueUsingTwoStacks();
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(17);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

    }
}
