
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            numOfNums += 1;
        }
        System.out.println("Number of numbers: " + numOfNums);
        scanner.close();
    }
}
