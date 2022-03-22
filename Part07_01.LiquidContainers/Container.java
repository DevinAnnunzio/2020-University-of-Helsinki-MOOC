/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Container {

    int liquidAmount;

    public Container() {
        liquidAmount = 0;
    }

    public void add(int amount) {
        if (amount > 0) {

            int potentialAdd = amount;
            liquidAmount += amount;
//        if (liquidAmount + potentialAdd <= 100 && potentialAdd > 0) {
//            liquidAmount += amount;
//        } else if(liquidAmount + potentialAdd > 100 && potentialAdd > 0){
//            liquidAmount = 100;
//        }
        }
    }

    public void minus(int amount) {
        if (amount > 0) {
            int potentialAmount = amount;
            liquidAmount -= amount;
//        if(liquidAmount - potentialAmount >= 0){
//            liquidAmount -= potentialAmount;
//        } else if(liquidAmount - potentialAmount <= 0){
//            liquidAmount = 0;
//        }
        }
    }

    public void set(int amount) {
        liquidAmount = amount;
    }

    public int get() {
        return liquidAmount;
    }

}
