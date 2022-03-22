
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics oddNum = new Statistics();
        Statistics evenNum = new Statistics();
        Statistics statistics = new Statistics();
        System.out.println("Enter numbers: ");
        while (true) {
            int userI = Integer.parseInt(scanner.nextLine());
            if (userI == -1) {
                System.out.println("Sum: " + statistics.sum());
                System.out.println("Sum of even numbers: " + evenNum.sum());
                System.out.println("Sum of odd numbers: " + oddNum.sum());
                break;
            }
            if (userI % 2 == 0) {
                evenNum.addNumber(userI);
            } else {
                oddNum.addNumber(userI);
            }

            statistics.addNumber(userI);
        }

    }
}
