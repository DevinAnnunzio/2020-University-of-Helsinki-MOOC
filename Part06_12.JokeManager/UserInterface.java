
import java.util.ArrayList;
import java.util.Random;
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

    private Scanner scanner;
    private JokeManager jm;

    public UserInterface(JokeManager jm,Scanner scanner) {
        this.jm = jm;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                add(joke);
            } else if (command.equals("2")) {
                drawJoke();
            } else if (command.equals("3")) {
                printJokes();
            }
        }
    }
    
    public void add(String word){
        jm.addJoke(word);
    }
    
    public void drawJoke(){
        System.out.println(jm.drawJoke());
    }
    public void printJokes(){
        jm.printJokes();
    }

}
