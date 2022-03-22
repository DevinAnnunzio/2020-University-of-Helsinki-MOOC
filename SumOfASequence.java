
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int userNum = Integer.valueOf(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i <= userNum; i++) {
            counter += i;

        }
        System.out.println("The sum is " + counter);

    }
}
