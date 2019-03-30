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

    public int getNoOfWheels() {
        return noOfWheels;
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

class Mercedes extends Car {
    public Mercedes(String name, int noOfCylinders) {
        super(name, noOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Mercedes - starting";
    }

    @Override
    public String accelerate() {
        return "Mercedes - reving";
    }

    @Override
    public String brake() {
        return "Mercedes - breaking";
    }
}

class Octavia extends Car {
    public Octavia(String name, int noOfCylinders) {
        super(name, noOfCylinders);
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

    public Ford(String name, int noOfCylinders) {
        super(name, noOfCylinders);
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


        Ford ford = new Ford("Fiesta",12);
        System.out.println(ford.getName());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Octavia octavia = new Octavia("1.6v", 6);
        System.out.println(octavia.getName());
        System.out.println(octavia.getNoOfCylinders());
        System.out.println(octavia.startEngine());
        System.out.println(octavia.accelerate());
        System.out.println(octavia.brake());

        Fiat fiat = new Fiat("Punto", 12);
        System.out.println(fiat.getName());
        System.out.println(fiat.startEngine());
        System.out.println(fiat.accelerate());
        System.out.println(fiat.brake());
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Vauxhall vauxhall = new Vauxhall("Cavelier", 14);
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

        Jeep3 jeep3 = new Jeep3("Mountain", 12, 1967);
        System.out.println(jeep3.getName());
        System.out.println(jeep3.startEngine());
        System.out.println(jeep3.accelerate());
        System.out.println(jeep3.brake());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(jeep3.getNoOfWheels());
        System.out.println(jeep3.getClass());
        System.out.println(jeep3.brake());
        System.out.println(jeep3.engineSize);

    }

    static class Jeep3 extends Car {
        private int engineSize;
        public Jeep3(String name, int noOfCylinders, int engineSize) {
            super(name, noOfCylinders);
            this.engineSize = engineSize;
        }

        @Override
        public int getNoOfWheels() {
            return super.getNoOfWheels();
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
        public Fiat(String name, int noOfCylinders) {
            super(name, noOfCylinders);
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
        public Vauxhall(String name, int noOfCylinders) {
            super(name, noOfCylinders);
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

    Ford ford = new Ford("Mondeo", 8);
}
