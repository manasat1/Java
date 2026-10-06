public class CountDigitsAndLetters {

    public static void main(String[] args) {

        String s = "Java123@";

        int letters = 0;
        int digits = 0;
        int specialCharacters = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else {
                specialCharacters++;
            }
        }

        System.out.println("String: " + s);
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specialCharacters);
    }
}
