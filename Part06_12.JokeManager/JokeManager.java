
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author devin
 */
public class JokeManager {

    private List<String> manager = new ArrayList<>();

    public JokeManager() {
        manager = new ArrayList<>();
    }

    public void addJoke(String joke) {
        manager.add(joke);
    }

    public String drawJoke() {
        Random rand = new Random();

        if (manager.isEmpty()) {
            return ("Jokes are in short supply.");
        }
        int num = rand.nextInt(manager.size());
        return (manager.get(num));

    }

    public void printJokes() {
        for (String joke : manager) {
            System.out.println(joke);
        }
    }

}
