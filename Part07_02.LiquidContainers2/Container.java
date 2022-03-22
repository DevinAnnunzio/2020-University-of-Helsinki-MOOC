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

    int liquid;

    public int contains() {
        return liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            liquid += amount;
            if (liquid > 100) {
                liquid = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            liquid -= amount;
            if (liquid < 0) {
                liquid = 0;
            }
        }

    }

    public String toString() {
        return liquid + "/100";
    }

}
