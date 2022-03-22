
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Give a year: ");
        int userYear = Integer.valueOf(scan.nextLine());
        
        if(userYear % 100 == 0 && userYear % 400 == 0){
            System.out.println("The year is a leap year.");
        } else if(userYear % 4 ==0 && userYear % 100 != 0){
            System.out.println("The year is a leap year.");
        } else{
            System.out.println("The year is not a leap year.");
        }

    }
}
