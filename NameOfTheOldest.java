
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        String userI;
        String nameOfC;
        String nameOfO = "";
        int current = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            userI = String.valueOf(scanner.nextLine());
            if (userI.isEmpty()) {
                break;
            } else {
                String editor[] = userI.split(",");
                int age = Integer.valueOf(editor[1]);
                nameOfC = String.valueOf(editor[0]);
                if (current < age) {
                    current = age;
                    nameOfO = nameOfC;

                }

            }
        }
        System.out.println("Age of the oldest: " + nameOfO);

    }
}
