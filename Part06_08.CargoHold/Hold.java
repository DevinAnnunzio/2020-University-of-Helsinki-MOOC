
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
public class Hold {

    private int maxAllowedWeightOfSuitcases;
    private ArrayList<Suitcase> suitcaseHolder = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxAllowedWeightOfSuitcases = maxWeight;
        this.suitcaseHolder = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = holdersCurrentWeight();
        int possibleSuitcaseWeight = suitcase.totalWeight();

        if (currentWeight + possibleSuitcaseWeight <= maxAllowedWeightOfSuitcases) {
            currentWeight += possibleSuitcaseWeight;
            suitcaseHolder.add(suitcase);
        }

    }

    //Holders current weight
    public int holdersCurrentWeight() {
        int currentWeight = 0;
        for (Suitcase s : suitcaseHolder) {
            currentWeight += s.totalWeight();
        }

        return currentWeight;
    }

    public void printItems() {
        for (Suitcase s : suitcaseHolder) {
            s.printItems();
        }
    }

    public String toString() {
        int currentWeight = 0;
        int casesInRack = 0;
        for (Suitcase s : suitcaseHolder) {
            currentWeight += s.totalWeight();
            casesInRack++;
        }

        if (suitcaseHolder.isEmpty()) {
            return "no items (0 kg)";
        } else if (suitcaseHolder.size() == 1) {
            return casesInRack + " suitcases (" + currentWeight + " kg)";
        } else {
            return casesInRack + " suitcases (" + currentWeight + " kg)";
        }
    }

}
