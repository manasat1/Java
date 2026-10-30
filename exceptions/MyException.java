class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }
}

class YourException extends RuntimeException {

    public YourException(String message) {
        super(message);
    }
}

class Calculator {

    public int sum(int x, int y)
            throws MyException, YourException {

        if (x == 10) {
            throw new MyException("x value is 10");
        }

        if (y == 10) {
            throw new YourException("y value is 10");
        }

        return x + y;
    }
}

class MyExceptionProgram {

    public static void main(String[] args) {

        try {
            Calculator c = new Calculator();

            System.out.println(c.sum(10, 10));

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Done");
    }
}
