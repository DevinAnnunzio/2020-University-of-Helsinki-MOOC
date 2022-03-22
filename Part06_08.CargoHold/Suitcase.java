
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author devin
 */
public class Suitcase {

    private ArrayList<Item> suitCase = new ArrayList<>();
    private int maxWeight;
//    private int currentWeight;
//    private int itemsInCase;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitCase = new ArrayList<>();
    }

    public void addItem(Item item) {
        int currentWeight = suitCasesCurrentWeight();
        int itemsInCase = 0;
        int possibleWeight = item.getWeight();
        if (possibleWeight + currentWeight <= maxWeight) {
            currentWeight += possibleWeight;
            suitCase.add(item);
            itemsInCase++;
        }

    }

    //used for getting the current weight for adding
    public int suitCasesCurrentWeight() {
        int currentWeight = 0;
        for (Item i : suitCase) {
            currentWeight += i.getWeight();
        }
        return currentWeight;
    }

    public void printItems() {
        for (Item item : suitCase) {
            System.out.println(item);
        }
    }

    //returns max weight of all items in a suitcase
    public int totalWeight() {
        maxWeight = 0;
        for (Item item : suitCase) {
            maxWeight += item.getWeight();
        }
        return maxWeight;
    }

    public Item heaviestItem() {
        if (suitCase.isEmpty()) {
            return null;
        }
        Item compare = suitCase.get(0);
        for (Item item : suitCase) {
            if (compare.getWeight() < item.getWeight()) {
                compare = item;
            }
        }
        return compare;
    }

    @Override
    public String toString() {
        int currentWeight = 0;
        int itemsInCase = 0;
        for (Item item : suitCase) {
            currentWeight += item.getWeight();
            itemsInCase++;
        }
        if (suitCase.isEmpty()) {
            return "no items (0 kg)";
        } else if (suitCase.size() == 1) {
            return itemsInCase + " item (" + currentWeight + " kg)";
        } else {
            return itemsInCase + " items (" + currentWeight + " kg)";
        }

    }

}
