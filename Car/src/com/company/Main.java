package com.company;

class Car {

    //base class
      private String name;
      private boolean engine;
      private int noOfCylinders;
      private int noOfWheels;

    public Car(String name, int noOfCylinders) {
        this.name = name;
        this.engine = true;
        this.noOfCylinders = noOfCylinders;
        this.noOfWheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }



    public String startEngine (){
        return "Car Class - reving up the engine";
    }

    public String accelerate () {
        return "Car class - vroom, vroom";
    }

    public String brake (){
        return "Car class - braking to a halt";
    }
}

class Octavia extends Car {
    public Octavia() {
        super("Skoda", 8);
    }

    @Override
    public String startEngine() {
        return "Octavia - starting";
    }

    @Override
    public String accelerate() {
        return "Octavia - reving";
    }

    @Override
    public String brake() {
        return "Octavia - breaking";
    }
}

class Ford extends Car {
    public Ford() {
        super("Ka", 12);
    }

    @Override
    public String startEngine() {
        return "Ka - starting up";
    }

    @Override
    public String accelerate() {
        return "Ka - reving";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "Ford - getClass - getSimple";
    }
}


public class Main {

    public static void main(String[] args){
Car car = new Car ("Rolls Royce", 18);
        System.out.println(car.getName());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car.startEngine());
        System.out.println(car.getNoOfCylinders());
        System.out.println("");
        System.out.println("");
        System.out.println("");


        Ford ford = new Ford();
        System.out.println(ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Octavia octavia = new Octavia();
        System.out.println(octavia.getName());
        System.out.println(octavia.getNoOfCylinders());
        System.out.println(octavia.startEngine());
        System.out.println(octavia.accelerate());
        System.out.println(octavia.brake());

        Fiat fiat = new Fiat();
        System.out.println(fiat.getName());
        System.out.println(fiat.startEngine());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.brake());
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Vauxhall vauxhall = new Vauxhall();
        System.out.println(vauxhall.getName());
        System.out.println(vauxhall.startEngine());
        System.out.println(vauxhall.accelerate());
        System.out.println(vauxhall.brake());
        System.out.println("");
        System.out.println("");
        System.out.println("");


        System.out.println(ford.getName());
        System.out.println(ford.getNoOfCylinders());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Jeep3 jeep3 = new Jeep3();
        System.out.println(jeep3.getName());
        System.out.println(jeep3.startEngine());
        System.out.println(jeep3.accelerate());
        System.out.println(jeep3.brake());
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    static class Jeep3 extends Car {
        public Jeep3() {
            super("Jeep3", 12);
        }

        @Override
        public String startEngine() {
            return "Jeep3 - starting up";
        }

        @Override
        public String accelerate() {
            return "Jeep3 - reving";
        }

        @Override
        public String brake() {
            return "Jeep3 - breaking";
        }
    }

    static class Fiat extends Car {
        public Fiat() {
            super("Punto", 14);
        }

        @Override
        public String startEngine() {
            return "Fiat - starting";
        }

        @Override
        public String accelerate() {
            return "Fiat - reving";
        }

        @Override
        public String brake() {
            return "Fiat - braking";
        }
    }

    static class Vauxhall extends Car {
        public Vauxhall() {
            super("Corsa", 16);
        }

        @Override
        public String startEngine() {
            return "Vauxhall - starting";
        }

        @Override
        public String accelerate() {
            return "Vauxhall - reving";
        }

        @Override
        public String brake() {
            return "Vauxhall - braking";
        }
    }
}
