
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int endNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int startNum = Integer.valueOf(scanner.nextLine());
        if (endNum >= startNum) {
            for (int i = startNum; i <= endNum; i++) {
                System.out.println(i);
            }
        }
    }
}
