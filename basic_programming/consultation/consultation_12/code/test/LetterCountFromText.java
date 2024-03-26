package code.test;

public class LetterCountFromText {
    public int countLetter(String text) {
        int count = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                count++;
            }
        }

        return count;
    }
}
