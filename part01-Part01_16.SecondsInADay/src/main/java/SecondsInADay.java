
import java.util.Scanner;

public class SecondsInADay {
public static final int SECONDS_PER_DAY = 86400;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");

        int totalDays = Integer.valueOf(scanner.nextLine());
        int totalSeconds = totalDays * SECONDS_PER_DAY;

        System.out.println(totalSeconds);

        scanner.close();
    }
}
