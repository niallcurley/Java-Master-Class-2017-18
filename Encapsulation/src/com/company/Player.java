package com.company;

public class Player {
    public String name;
    public int health;
    public String weapon;// 3 fields are set to public so we can initialize them from main program

    public void looseHealth (int damage){
        this.health = this.health - damage;
        if(this.health <=0){
            System.out.println("Player knocked out");
        } //else {
           // System.out.println("Current health " + this.health);
       // }

    }

    public int healthRemaining () {
        return this.health;
    }

}
