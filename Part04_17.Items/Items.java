
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userI = String.valueOf(scanner.nextLine());
            if (userI.isEmpty()) {
                break;
            }
            Item freshI = new Item(userI);
            items.add(freshI);
        }

        for (Item item : items) {
            System.out.println(item);
        }

    }
}
