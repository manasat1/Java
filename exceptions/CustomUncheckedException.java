class InvalidSalaryException extends RuntimeException {

    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee {

    static void checkSalary(double salary) {

        if (salary < 0) {
            throw new InvalidSalaryException(
                "Salary cannot be negative"
            );
        }

        System.out.println("Valid salary: " + salary);
    }
}

class CustomUncheckedException {

    public static void main(String[] args) {

        try {
            Employee.checkSalary(-5000);

        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}
