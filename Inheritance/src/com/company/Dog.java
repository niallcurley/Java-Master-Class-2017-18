package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat) {
        super(name,1,1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew (){
        System.out.println("Dog chew called");
    }

    public void walk (){
        System.out.println("Dog.walk called");
        super.move(5);
    }

    public void run (){
        System.out.println("Dog.run called");
        move(10);
    }

    private void moveLegs (int speed){
        System.out.println("Dogs legs move at " + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs (speed);
        super.move(speed);
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat method called");
        chew();
        super.eat();
    }
}
