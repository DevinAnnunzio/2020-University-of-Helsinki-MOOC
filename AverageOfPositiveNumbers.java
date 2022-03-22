
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (userNum > 0) {
                counter++;
                sum += userNum;
            }

        }
        System.out.println((double) sum / counter);

    }
}
