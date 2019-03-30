package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

        int speedLimit = 55;

        //this ifElseifElse statment allows lots of choices - there are no curly brackets used
        // - else if goes between if and the else as many as you need
        if(speedLimit <= 30)
            System.out.println("Your are driving at a legal speed limit");
        else if(speedLimit >30 && speedLimit<40)
        System.out.println("This is a 30 zone you are breaking speeding laws");
        else if(speedLimit >40 && speedLimit<50)
            System.out.println("This is a 40 zone you are breaking speeding laws");
        else if(speedLimit >50 && speedLimit<60)
            System.out.println("This is a 50 zone you are breaking speeding laws");
        else if(speedLimit >60 && speedLimit<70)
            System.out.println("This is a 60 zone you are breaking speeding laws");
        else
            System.out.println("Your are driving over the national speed limit");

    }
}
