
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userId;
        String userN;
        ArrayList<Item> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            userId = scanner.nextLine();
            if (userId.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            userN = scanner.nextLine();
            if (userN.isEmpty()) {
                break;
            }

            Item item = new Item(userId, userN);
            if (!archive.contains(item)) {
                archive.add(item);
            }

        }

        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item.identifier + ": " + item.name);
        }

    }
}
