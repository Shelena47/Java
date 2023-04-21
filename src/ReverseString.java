
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("This program will reverse any word--");

        Scanner rs = new Scanner(System.in);
        System.out.println("Enter any word: ");
        char[] letters = rs.nextLine().toCharArray();
        for (int i = letters.length -1; i >= 0; i--) {
        System.out.println(letters[i]);
    }
}
}