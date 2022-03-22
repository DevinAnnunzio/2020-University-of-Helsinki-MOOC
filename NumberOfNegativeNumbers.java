
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            if (userNum == 0) {
                break;
            } else if (userNum < 0) {
                counter++;
            }

        }
        System.out.println("Number of negative numbers: " + counter);
    }
}
