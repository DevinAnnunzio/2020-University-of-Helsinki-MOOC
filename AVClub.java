
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userW = String.valueOf(scanner.nextLine());
            if (!userW.isEmpty()) {
                if (userW.contains("av")) {
                    String pieces[] = userW.split(" ");
                    for (int i = 0; i < pieces.length; i++) {
                        System.out.println(pieces[i]);
                    }
                }

            } else {
                break;
            }
        }
    }
}
