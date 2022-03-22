
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userN = String.valueOf(scanner.nextLine());
        System.out.println("Enter password: ");
        String userP = String.valueOf(scanner.nextLine());

        if (userN.equals("alex") && userP.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (userN.equals("emma") && (userP.equals("haskell"))) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");

        }

    }
}
