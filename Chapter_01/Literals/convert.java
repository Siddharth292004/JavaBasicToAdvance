public class convert {
    public static void main(String[] args) {
        // Loop from 0 to 25 (26 letters)
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i); // Convert number to corresponding letter
            System.out.println(letter);     // Print the letter
        }
    }
}
