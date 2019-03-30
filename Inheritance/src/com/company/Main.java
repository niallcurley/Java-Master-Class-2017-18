package com.company;

public class Main {

    public static void main(String[] args) {
       Animal animal = new Animal("Animal",1,1,5,5 );

       Dog dog = new Dog("Jack Russell", 8,20,2,4,34,1,"Long Scruffy");
       //dog.eat();
       //dog.run();
       //dog.walk();

        Fish fish = new Fish("Gold Fish", 3,5,2,2,4);
        //fish.swim(15);

        dog.move(25);

    }
}
