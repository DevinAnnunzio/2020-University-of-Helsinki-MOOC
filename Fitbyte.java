/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Fitbyte {

    private int age;
    private int restingHr;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHr = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHr = 206.3 - (0.711 * age);
        double targetHr = ((maxHr - restingHr) * percentageOfMaximum + restingHr);
        return targetHr;
    }

}
