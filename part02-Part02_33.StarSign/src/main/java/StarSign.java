
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        while (number > 0) {
            System.out.print("*");
            number--;
        }
        System.out.printf("\n");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int lines = size;
        while (lines > 0) {
            printStars(size);
            lines--;
        }
        System.out.printf("\n");
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        while (height > 0) {
            printStars(width);
            height--;
        }
        System.out.printf("\n");
    }

    public static void printTriangle(int size) {
        int start = 1;
        while (start <= size) {
            printStars(start);
            start++;
        }
        System.out.printf("\n");
    }
}
