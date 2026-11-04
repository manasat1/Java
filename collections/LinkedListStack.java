import java.util.LinkedList;

class LinkedListStack {

    public static void main(String[] args) {

        LinkedList<Integer> stack = new LinkedList<>();

        // Adding elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Viewing the top element
        System.out.println("Top element: " + stack.peek());

        // Removing the top element
        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack after removal: " + stack);
    }
}
