import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Value of the gift? ");
        int giftValue = Integer.parseInt(scan.nextLine());

        double tax = calculateGiftTax(giftValue);

        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }

        scan.close();
    }

    public static double calculateGiftTax(int value) {
        if (value < 5000) {
            return 0;  // No tax for gifts under €5000
        } else if (value < 25000) {
            return 100 + (value - 5000) * 0.08;
        } else if (value < 55000) {
            return 1700 + (value - 25000) * 0.10;
        } else if (value < 200000) {
            return 4700 + (value - 55000) * 0.12;
        } else if (value < 1000000) {
            return 22100 + (value - 200000) * 0.15;
        } else {
            return 142100 + (value - 1000000) * 0.17;
        }
    }
}
