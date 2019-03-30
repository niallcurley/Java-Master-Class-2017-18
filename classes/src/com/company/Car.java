package com.company;
//some notes on variable, local variable belong to methods and cant be accessed outside it.
//other variable is class variable or field variable - they are accessable within the class

//public is an access modifier because its to do with how much access you get to the class
// other modifiers are private and protected
public class Car {

    //first we start with the field variable, we create the 'state' of the object.
    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setModel (String model){
        this.model = model;//'this' refers to the field variable 'private String model'.
        // An 'f' appears for field and a 'p' appears for parameter 'String model'.
        String validModel = model.toLowerCase();//validation for lower case
        if(validModel.equals("porsche") || validModel.equals("commodore")){//test is it porsche or commodore
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel(){

        return  this.model;
    }

}
