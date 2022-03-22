
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Caput Draconis";
        // Write your program here 
        System.out.println("Password?");
        String userWord = String.valueOf(scan.nextLine());
        
        if(userWord.equals(password)){
            System.out.println("Welcome!");
        } else{
            System.out.println("Off with you!");
        }
    }
}
