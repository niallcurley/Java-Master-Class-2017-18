package com.company;

public class Machine {

    private String name;
    private int code;

    public Machine (){
        this("Peter");//calling the third constructor from inside the first
        System.out.println("First Constructor is running");
        //name = "Arnie";

    }

    public Machine (String name){
        this(name, 0);
        this.name = name;
        System.out.println("Second constructor is working");

    }

    public Machine (String name, int code){
        this.name = name;
        this.code = code;
        System.out.println("Third constrcutor is running");
    }


}
