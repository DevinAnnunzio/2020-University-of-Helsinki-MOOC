
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double taxTotal;
        System.out.println("Value of the gift?");
        double userGift = Integer.valueOf(scan.nextLine());

        if (userGift >= 5000 && userGift <= 24999) {
            taxTotal = 100 + (userGift - 5000) * .08;
            System.out.println("Tax: " + taxTotal);
        } else if (userGift >= 25000 && userGift <= 54999) {
            taxTotal = 1700 + (userGift - 25000) * .10;
            System.out.println("Tax: " + taxTotal);
        } else if (userGift >= 55000 && userGift <= 199999) {
            taxTotal = 4700 + (userGift - 55000) * .12;
            System.out.println("Tax: " + taxTotal);
        } else if (userGift >= 200000 && userGift <= 999999) {
            taxTotal = 22100 + (userGift - 200000) * .15;
            System.out.println("Tax: " + taxTotal);
        } else if (userGift >= 1000000) {
            taxTotal = 142100 + (userGift - 1000000) * .17;
            System.out.println("Tax: " + taxTotal);
        } else {
            System.out.println("No tax!");
        }

    }
}
