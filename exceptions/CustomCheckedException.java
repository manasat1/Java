class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

class Voting {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("You are eligible to vote");
    }
}

class CustomCheckedException {

    public static void main(String[] args) {

        try {
            Voting.checkAge(16);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");
    }
}
