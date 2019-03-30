package com.company;

class Vehicle {
    public int wheels;
    public int engineSize;
    public String name;
    public String colour;
    public boolean hatchBack;

    public Vehicle(int engineSize, String name, String colour, boolean hatchBack) {
        this.engineSize = engineSize;
        this.name = name;
        this.colour = colour;
        this.hatchBack = hatchBack;
        this.wheels = 4;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public boolean isHatchBack() {
        return hatchBack;
    }

    public void startUp (){
        System.out.println("Put key in ignition and turn");

    }

    public void driveForward () {
        System.out.println("Clutch and first gear, put foot on accelerator and release clutch");
    }

    public void brake (){
        System.out.println("Slow down by pressing brake");
    }
}

class Car extends Vehicle {
    int doors;
    String upholstery;
    public Car(int engineSize, String name, String colour, boolean hatchBack, int doors, String upholstery) {
        super(engineSize, name, colour, hatchBack);
        this.doors = doors;
        this.upholstery = upholstery;
    }

    public int getDoors() {
        return doors;
    }

    public String getUpholstery() {
        return upholstery;
    }

    @Override
    public void startUp() {
        super.startUp();
    }

    @Override
    public void driveForward() {
        super.driveForward();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class SportsCar extends Car{
    boolean sportsSeates;
    public SportsCar(int engineSize, String name, String colour, boolean hatchBack, int doors, String upholstery, boolean sportsSeates) {
        super(engineSize, name, colour, hatchBack, doors, upholstery);
        this.sportsSeates = sportsSeates;
    }

    public boolean isSportsSeates() {
        return sportsSeates;
    }

    @Override
    public void startUp() {
        super.startUp();
    }

    @Override
    public void driveForward() {
        super.driveForward();
    }

    @Override
    public void brake() {
        super.brake();
    }
}


public class Main {

    public static void main(String[] args) {
	SportsCar sportsCar = new SportsCar(1900, "Tiger", "Black", true, 2, "Leather", true);

        System.out.println(sportsCar.getEngineSize());
        System.out.println(sportsCar.getName());
        System.out.println(sportsCar.getColour());
        System.out.println(sportsCar.getDoors());
        System.out.println(sportsCar.getUpholstery());
        sportsCar.startUp();
        sportsCar.driveForward();
        sportsCar.brake();
        sportsCar.isSportsSeates();


        System.out.println(sportsCar.isSportsSeates());




    }
}
