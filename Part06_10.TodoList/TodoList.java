
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author devin
 */
public class TodoList {

    private List<String> list = new ArrayList<>();

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String word) {
        list.add(word);
    }

    public void print() {
        int counter = 1;
        for (String item : list) {
            System.out.println(counter + ": " + item);
            counter++;
        }
    }

    public void remove(int number) {
        list.remove(number-1);
    }

}
