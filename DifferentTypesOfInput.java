
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String userS = scan.nextLine();
        System.out.println("Give an integer:");
        int userN = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double userD = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean userB = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + userS);
        System.out.println("You gave the integer " + userN);
        System.out.println("You gave the double " + userD);
        System.out.println("You gave the boolean " + userB);
        

    }
}
