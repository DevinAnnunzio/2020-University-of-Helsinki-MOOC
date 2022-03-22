
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        String userI;
        int current = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            userI = String.valueOf(scanner.nextLine());
            if (userI.isEmpty()) {
                break;
            } else {
                String editor[] = userI.split(",");
                int age = Integer.valueOf(editor[1]);
                if (current < age) {
                    current = age;
                }

            }
        }
        System.out.println("Age of the oldest: " + current);

    }
}
