
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userW = String.valueOf(scanner.nextLine());
            if (userW.isEmpty()) {
                break;
            } else {
                String pieces[] = userW.split(" ");
                System.out.println(pieces[pieces.length - 1]);
            }
        }

    }
}
