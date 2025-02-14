
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numOfNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            sum += userNum;
            numOfNums += 1;
        }
        System.out.println("Average of the numbers: " + ((double)sum/numOfNums));
        scanner.close();
    }
}
