
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author devin
 */
public class UserInterface {

    private Container container1;
    private Scanner scan;
    private Container container2;

    public UserInterface() {
        container1 = new Container();
        container2 = new Container();
        scan = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1.liquidAmount + "/100");
            System.out.println("Second: " + container2.liquidAmount + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            commands(input);

        }

    }

    public void commands(String input) {
        String[] parts = input.split(" ");
        String command = parts[0];
        int amount = Integer.parseInt(parts[1]);
        if (command.equals("add")) {
            add(amount);
        } else if (command.equals("move")) {
            move(amount);
        } else if (command.equals("remove")) {
            remove(amount);
        }

    }

    public void add(int amount) {
        container1.add(amount);
        if (container1.liquidAmount > 100) {
            container1.liquidAmount = 100;
        }
    }

    public void move(int amount) {
        int convert = container1.liquidAmount - amount;
        int leftOver = Math.abs(convert);
        if (container1.liquidAmount == 0) {

        } else if (container1.liquidAmount - amount >= 0) {
            container1.minus(amount);
            container2.add(amount);
            if (container2.liquidAmount > 100) {
                container2.set(100);
            }
        } else if (container1.liquidAmount - amount < 0) {
            container2.add(container1.liquidAmount);
            container1.set(0);
            if (container2.liquidAmount > 100) {
                container2.set(100);
            }

        }
    }

    public void remove(int amount) {
        container2.minus(amount);
        if (container2.liquidAmount <= 0) {
            container2.set(0);
        }

    }
}
