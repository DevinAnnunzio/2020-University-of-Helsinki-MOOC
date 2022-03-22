
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userNum = String.valueOf(scanner.next());
            if (userNum.equals("end")) {
                break;
            }
            int changer = Integer.parseInt(userNum);
            System.out.println((int) Math.pow(changer, 3));

        }
    }
}
