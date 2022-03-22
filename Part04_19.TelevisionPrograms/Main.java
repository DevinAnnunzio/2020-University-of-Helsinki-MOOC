
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String userS = String.valueOf(scanner.nextLine());
            if (userS.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int userD = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(userS, userD));
        }

        System.out.println("Programs max duration? ");
        int duration = Integer.valueOf(scanner.nextInt());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= duration) {
                System.out.println(program);
            }
        }

    }
}
