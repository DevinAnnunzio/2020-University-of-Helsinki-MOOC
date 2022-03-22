
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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            processCommand(input);
    
        }
    }

    //used for each command
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            System.out.println("Which one is removed?");
            //.nextInt() left the scanner still open? 
            int removeIndex = Integer.parseInt(scanner.nextLine());
            remove(removeIndex);
        }

    }

    public void add() {
        System.out.print("To add: ");
        String item = scanner.nextLine();
        list.add(item);
    }

    public void list() {
        list.print();
    }

    public void remove(int number) {
        list.remove(number);
    }

}
