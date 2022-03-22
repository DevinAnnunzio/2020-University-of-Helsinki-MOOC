
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.valueOf(scanner.nextLine());
        int secNum = Integer.valueOf(scanner.nextLine());

        if (firstNum > secNum) {
            System.out.println(firstNum + " is greater than " + secNum + ".");
        } else if (firstNum < secNum) {
            System.out.println(firstNum + " is smaller than " + secNum + ".");
        } else {
            System.out.println(firstNum + " is equal to " + secNum + ".");
        }

    }
}
