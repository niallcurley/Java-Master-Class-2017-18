package com.company;

public class Main {

    public static void main(String[] args) {
//	Player player = new Player();//a default constructor has been created with no parametres
//        player.name = "John";
//        player.health = 40;
//        player.weapon = "Sword";
//
//        //player.looseHealth(10);
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//
//        //changing name from main program
//        player.name = "Freddie";
//        System.out.println("Name of Player " + player.name);
//
//        //changing name of weapon
//        player.weapon = "AK 47";
//        System.out.println("Type of Weapon " + player.weapon);
//
//        player.looseHealth(45);
//        player.health = 100;
//        //player.healthRemaining();
//        System.out.println("Remaining health " + player.healthRemaining());

// after having done private fields in Enhanced Player
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("peter", 200, "spear");
        //enhancedPlayer.looseHealth(23);
        System.out.println("Remaining health " + enhancedPlayer.healthRemaining());

    }
}
