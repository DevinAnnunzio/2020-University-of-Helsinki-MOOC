
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From where?");
        int startNum = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int endNum = Integer.valueOf(scanner.nextLine());

        while (startNum <= endNum) {
            System.out.println(numbers.get(startNum));
            startNum++;
        }

    }
}
