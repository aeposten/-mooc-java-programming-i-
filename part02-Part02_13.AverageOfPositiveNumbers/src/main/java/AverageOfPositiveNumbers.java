
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sumOfNums = 0;
        while (true) {
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                if (sumOfNums == 0) {
                    System.out.println("Cannot calculate average");
                    break;
                }
                break;
            }

            if (userNum > 0) {
                numOfNums += 1;
                sumOfNums += userNum;
            }
        }
        System.out.println((double) sumOfNums/numOfNums);
        scanner.close();
    }
}
