
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        int userInput = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        for (int i = factorial; i <= userInput; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
