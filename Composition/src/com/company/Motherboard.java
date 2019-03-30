package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String biosName;

    //constructor
    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String biosName) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.biosName = biosName;
    }

    //method for loading
    public void loadProgram (String programName){
        System.out.println("Program is now " + programName + " is now loading.");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBiosName() {
        return biosName;
    }

    public void setBiosName(String biosName) {
        this.biosName = biosName;
    }
}
