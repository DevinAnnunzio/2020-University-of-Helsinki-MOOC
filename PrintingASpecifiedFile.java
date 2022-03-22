
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        String userI = String.valueOf(userScanner.nextLine());

        try (Scanner scanner = new Scanner(Paths.get(userI))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
