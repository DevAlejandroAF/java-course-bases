import java.util.Scanner;

public class TerminalBase {
    public static void main(String[] args) {
        System.out.println("Type something: ");
        // Terminal input
        Scanner scanner = new Scanner(System.in);
        var termMsg = scanner.nextLine();
        // Terminal print
        System.out.println(termMsg);
    }
}
