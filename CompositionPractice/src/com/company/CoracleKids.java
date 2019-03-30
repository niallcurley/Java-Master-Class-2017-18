package com.company;

public class CoracleKids {
    String name;
    String adddress;
    int dateOfBirth;
    String gender;

    public CoracleKids(String name, String adddress, int dateOfBirth, String gender) {
        this.name = name;
        this.adddress = adddress;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAdddress() {
        return adddress;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void playFootball (){
        System.out.println("Coracle kids ");
    }

    public void noOfKids (int noOfChildren){
        System.out.println("The number of kids on today is " + noOfChildren );
    }


}
