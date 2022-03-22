/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Counter {

    int currentVal;

    public Counter() {
        currentVal = 0;
    }

    public Counter(int inpStartVal) {
        this.currentVal = inpStartVal;
    }

    public int value() {
        return currentVal;
    }

    public void increase() {
        currentVal++;
    }

    public void decrease() {
        currentVal--;
    }

    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            currentVal += increaseBy;
        }

    }

    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            currentVal -= decreaseBy;
        }

    }

}
