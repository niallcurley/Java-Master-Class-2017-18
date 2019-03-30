package com.company;

public class Main {

    public static void main(String[] args) {

        //BankAccount acc = new BankAccount ();
        BankAccount acc = new BankAccount (23456,567123,"peter woods", "ph@live.co.uk", "90876453");
        //calling the constructor
        //this new object is created from with the name of class 'BankAccount'.
        //this creates the object from the class for us instead of using the setters.
        //values are passed into the parameters in 'new BankAccount (), in the main method, which has already been constructed.

        System.out.println(acc.getAccNumber());
        System.out.println (acc.getBalance());
        System.out.println (acc.getName());
        System.out.println(acc.getEmail());
        System.out.println(acc.getPhoneNumber());



        acc.setAccNumber(12489);
        System.out.println("Your Account No. " + acc.getAccNumber());
        acc.depositAmount(50.0);
        acc.withDrawAmount(100.0);
        acc.setBalance(200.0);
        System.out.println("Your Balance is £" + acc.getBalance());

        acc.setName("Niall Curley");
        System.out.println("Your Name is " + acc.getName());

        acc.setEmail("niallcurley@live.co.uk");
        System.out.println("Your Email is "+ acc.getEmail());

        acc.setPhoneNumber("212875671");
        System.out.println("Your Phone Number is " + acc.getPhoneNumber());

        acc.depositAmount(10.0);

        //System.out.println("Your New Balance is " + acc.getBalance());

        acc.withDrawAmount(50.0);
       // System.out.println("Your New Balance After Withdrawal is " + acc.getBalance());

        //acc.withDrawAmount(7581.0);

        //acc.getBalance();

        BankAccount johnsAcc = new BankAccount("John Peel","jp@hotmail.co.uk", "0289075437");

        System.out.println("Customer name " + johnsAcc.getName());
        System.out.println("Customer email address " + johnsAcc.getEmail());
        System.out.println("Customer phonenumber " +johnsAcc.getPhoneNumber());
        System.out.println("Customer account number " + johnsAcc.getAccNumber()+ " Customer name " +johnsAcc.getName());

        VipCustomer creditLimit = new VipCustomer("Patrick Campbell", 6000.0, "pc@live.co.uk");

        System.out.println("Tests on Vip Customer Name " + creditLimit.getName());
        System.out.println("Tests on Vip Customer Credit Limit " + creditLimit.getCreditLimit());
        System.out.println("Tests on Vip Customer Email Address " + creditLimit.getEmailAddress());

        VipCustomer defaultTest = new VipCustomer("James Sloan",8000.0);
        System.out.println("Default Test For Customer Name: " + defaultTest.getName());
        System.out.println("Default Test For Customer Credit Limit: " + defaultTest.getEmailAddress());
        System.out.println("Default Test For Customer Address: " + defaultTest.getEmailAddress());

        //VipCustomer oneDefaultTest = new VipCustomer ("norman bates");

        VipCustomer fullDefaultTest = new VipCustomer();
        System.out.println("Default Test For Customer Details : " + fullDefaultTest.getName());
        System.out.println("Default Test For Customer Details : " + fullDefaultTest.getCreditLimit());
        System.out.println("Default Test For Customer Details : " + fullDefaultTest.getEmailAddress());
        System.out.println("************************************************************************");
        System.out.println("************************************************************************");
        System.out.println("************************************************************************");
        System.out.println("************************************************************************");

        //VipCustomer second round of tests after video

        VipCustomer person1 = new VipCustomer();
        System.out.println("Name of Customer " + person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println("Name of Customer " + person2.getName());

        VipCustomer person3 = new VipCustomer("Tim",1000.0,"tim@email.co.uk");
        System.out.println("Name of Customer "+ person3.getName());
        System.out.println("Name of Customer Email: "+ person3.getEmailAddress());




















    }
}
