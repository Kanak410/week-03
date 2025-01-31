package stackAndQueue.implementQueue;
import java.util.Stack;
public class QueueUsingTwoStacks {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;
    public QueueUsingTwoStacks(){
        enqueueStack=new Stack<>();
        dequeueStack=new Stack<>();

    }
    public void enqueue(int w){
        enqueueStack.push(w);
    }
    public int dequeue(){
        if (dequeueStack.isEmpty()) {

            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }
        if(dequeueStack.isEmpty()){
            throw new RuntimeException("Queue is empty");

        }
        return dequeueStack.pop();
    }
    // Peek (Front of Queue)
    public int peek(){
        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }
        if(dequeueStack.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return dequeueStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty(){
        return enqueueStack.isEmpty()&& dequeueStack.isEmpty();
    }

}
