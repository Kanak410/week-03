package doubleLinkedList.undoRepoFunction;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(10);

        editor.addState("St 1");
        editor.addState("St 2");
        editor.addState("St 3");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();
    }
}
