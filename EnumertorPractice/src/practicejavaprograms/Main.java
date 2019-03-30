package practicejavaprograms;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {

        //this enchanced loop goes through the full set of objects and values
        for(Enumerator myKids : Enumerator.values())
            System.out.printf("%s\t%s\t%s\n", myKids, myKids.getBirthOrder(),myKids.getAge());


        System.out.println("This is the range of values chosen\n");

        //this uses the Enumerator range to select specific objects and values
        for (Enumerator myKids : EnumSet.range(Enumerator.niall, Enumerator.tiaran))
            System.out.printf("%s\t%s\t%s\n", myKids, myKids.getBirthOrder(),myKids.getAge());

    }

}
