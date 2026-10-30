class StackOverflow extends Exception {

    public StackOverflow(String message) {
        super(message);
    }
}

class StackUnderflow extends Exception {

    public StackUnderflow(String message) {
        super(message);
    }
}

class Stack {

    private int[] st;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        st = new int[size];
        top = -1;
    }

    public void push(int val) throws StackOverflow {

        if (top == size - 1) {
            throw new StackOverflow("Stack Overflow");
        }

        st[++top] = val;
    }

    public int pop() throws StackUnderflow {

        if (top == -1) {
            throw new StackUnderflow("Stack Underflow");
        }

        return st[top--];
    }
}

class StackExceptions {

    public static void main(String[] args) {

        Stack s = new Stack(5);

        try {
            s.push(5);
            s.push(10);
            s.push(15);
            s.push(20);
            s.push(25);
            s.push(30);

        } catch (StackOverflow e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(s.pop());
            }

        } catch (StackUnderflow e) {
            System.out.println(e.getMessage());
        }
    }
}
