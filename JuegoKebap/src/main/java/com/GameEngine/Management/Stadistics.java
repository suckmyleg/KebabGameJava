package com.GameEngine.Management;

import com.GameEngine.Vectors.Vector;

import java.util.Date;

/**
 * Class that saves the time from start and lets the user get the fps, deltaTime and runningTime
 * @author suckmyleg
 * @version 1.0
 */
public class Stadistics {
    private double TotalRunned;
    private double RunTime;
    private double LastTime;
    private double Lapsed;
    private Vector size;


    public double getLapsed(){return this.Lapsed;}
    public double deltaTime(){
        return this.Lapsed/1000;
    }

    public int fps(){
        return this.Lapsed*100==0?0:(int)(1/this.Lapsed);
    }

    public Stadistics(){
        this.RunTime = new Date().getTime();
        this.LastTime = new Date().getTime();

        this.TotalRunned = 0;
        this.Lapsed = 0;

        this.size = new Vector(0,0,0);
    }
    public Vector getSize(){return this.size;}
    public double getTotalLapsed(){
        return new Date().getTime() - this.RunTime;
    }

    public void run(){
        this.TotalRunned++;

        this.Lapsed =  new Date().getTime() - this.LastTime;

        this.LastTime =  new Date().getTime();
    }
    public void run(double w, double h){
        this.size = new Vector(w, h);
        this.run();
    }
}
