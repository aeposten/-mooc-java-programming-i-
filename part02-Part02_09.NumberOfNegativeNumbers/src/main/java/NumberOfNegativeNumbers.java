
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNegNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            if (userNum < 0) {
                numOfNegNums += 1;
            }
        }
        System.out.println("Number of negative numbers: " + numOfNegNums);
        scanner.close();
    }
}
