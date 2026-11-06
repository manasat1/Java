import java.util.Stack;

class StackCollections {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // Adding elements to the stack
        st.push(110);
        st.push(120);
        st.push(130);
        st.push(140);
        st.push(150);

        // Accessing the top element
        System.out.println("Top element: " + st.peek());

        // Displaying the stack
        System.out.println("Stack elements: " + st);

        // Removing elements from the stack
        System.out.println("Removing elements:");

        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("Is stack empty: " + st.empty());
    }
}
