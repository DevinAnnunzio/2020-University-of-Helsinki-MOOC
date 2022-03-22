
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

    public UserInterface(Scanner scan) {
        container1 = new Container();
        container2 = new Container();
        this.scan = scan;

    }

    public void start() {
        while (true) {
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());
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

    }

    public void move(int amount) {
        int convert = container1.contains() - amount;
        int leftOver = Math.abs(convert);

        if (container1.contains() - amount >= 0) {
            container1.remove(amount);
            container2.add(amount);

        } else if (container1.contains() - amount < 0) {
            container2.add(container1.contains());

        }

    }

    public void remove(int amount) {
        container2.remove(amount);

    }
}
