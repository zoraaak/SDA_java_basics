import java.util.Scanner;

public class TextFromTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Witaj " + text);
    }
}
