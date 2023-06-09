package com.GameEngine.Management;

import java.util.Date;

/**
 * Stats about the player, can be moved, etc
 * @author suckmyleg
 * @version 1.0 (Abandoned?)
 */
public class PlayerStats {
    private double moved;
    private final double startTime;

    public PlayerStats(){
        this.startTime = new Date().getTime();
    }


    public void addMove(double x, double y){this.moved+=x+y;}
    public void addMove(double x){this.moved+=x;}

    public double getTime(){return new Date().getTime() - this.startTime;}
    public double getMoved(){return this.moved;}

    @Override
    public String toString(){
        return "moved: "+moved;
    }
}
