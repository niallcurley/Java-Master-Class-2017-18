package com.company;

public class CleaningRota {
    private String name;
    private double time;
    private String day;
    private int noOfKettles;
    private int noOfChairs;

    public CleaningRota(String name, double time, String day, int noOfKettles, int noOfChairs) {
        this.name = name;
        this.time = time;
        this.day = day;
        this.noOfKettles = noOfKettles;
        this.noOfChairs = noOfChairs;
    }

    public String getName() {
        return name;
    }

    public double getTime() {
        return time;
    }

    public String getDay() {
        return day;
    }

    public int getNoOfKettles() {
        return noOfKettles;
    }

    public int getNoOfChairs() {
        return noOfChairs;
    }

    public void putOutChairs (int noOfChairs){
        this.noOfChairs = noOfChairs;
        System.out.println("The number of chairs to put out " + noOfChairs);
    }

    public void hooverRoom (){
        System.out.println("Clean all of rooms and landing, empty bin");
    }

    public void makeTea (int noOfKettles){
        this.noOfKettles = noOfKettles;
        System.out.println("The number of kettles required are " + noOfKettles);
    }
}
