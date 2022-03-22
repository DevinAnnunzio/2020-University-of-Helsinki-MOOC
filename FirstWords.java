
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userW = String.valueOf(scanner.nextLine());
            if (userW.isEmpty()) {
                break;
            } else {
                String pieces[] = userW.split(" ");
                System.out.println(pieces[0]);
            }
        }

    }
}
