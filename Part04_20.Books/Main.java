
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String userT = String.valueOf(scanner.nextLine());

            if (userT.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int userP = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            int userPY = Integer.parseInt(scanner.nextLine());

            books.add(new Book(userT, userP, userPY));
        }

        System.out.println("What information will be printed?");
        String userChoice = String.valueOf(scanner.nextLine());

        if (userChoice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.everything());
            }

        } else if (userChoice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.bookTitle());
            }
        }

    }
}
