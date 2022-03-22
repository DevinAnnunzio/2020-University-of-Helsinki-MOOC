
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        int counter = 0;
        int total = 0;
        double sum;
        String longestN = "";
        while (true) {
            String userI = String.valueOf(scanner.nextLine());
            if (userI.isEmpty()) {
                break;
            } else {
                String editor[] = userI.split(",");
                String editName = String.valueOf(editor[0]);
                int editNum = Integer.valueOf(editor[1]);
                total += editNum;
                counter++;
                if (longestN.length() < editName.length()) {
                    longestN = editName;
                }
            }

        }
        sum = (double) total / counter;
        System.out.println("Longest name: " + longestN);
        System.out.println("Average of the birth years: " + sum);

    }
}
