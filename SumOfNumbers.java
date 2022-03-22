
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            if (userNum == 0) {
                break;
            }
            counter += userNum;

        }
        System.out.println("Sum of the numbers: " + counter);

    }
}
