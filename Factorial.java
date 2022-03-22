
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int userNum = Integer.valueOf(scanner.nextLine());

        int total = 1;

        for (int i = 1; i <= userNum; i++) {
            total *= i;
        }

        if (userNum == 0) {
            System.out.println("Factorial: " + 1);
        } else {
            System.out.println("Factorial: " + total);
        }

    }
}
