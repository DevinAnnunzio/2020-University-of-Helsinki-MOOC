
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int userGrade = Integer.valueOf(scan.nextLine());
        
        if(userGrade < 0){
            System.out.println("impossible!");
        } else if(userGrade>=0 && userGrade<=49){
            System.out.println("failed");
        } else if(userGrade >= 50 && userGrade <= 59){
            System.out.println("1");
        } else if(userGrade >= 60 && userGrade <= 69){
            System.out.println("2");
        } else if(userGrade >= 70 && userGrade <= 79){
            System.out.println("3");
        } else if(userGrade >= 80 && userGrade <= 89){
            System.out.println("4");
        } else if(userGrade >= 90 && userGrade <= 100){
            System.out.println("5");
        } else{
            System.out.println("incredible!");
        }

    }
}
