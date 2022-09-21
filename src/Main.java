import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = in.nextLine();
        System.out.print(wordCheck(word));
    }

    public static boolean wordCheck(String word) {
        if (word.endsWith("ed")) {
            return true;
        }
        else {
            return false;
        }
    }
}
