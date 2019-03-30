package practicejavaprograms;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {

      for(Enumerator myFriends : Enumerator.values())
          System.out.printf("%s\t%s\t\t%s\t\t\t%s\n",myFriends, myFriends.getFirstName(),myFriends.getSurname(),myFriends.getYear());

        System.out.println("This is demonstrating the range of values\n");


        for (Enumerator myFriends : EnumSet.range(Enumerator.Coracle2,Enumerator.Coracle6))
        System.out.printf("%s\t%s\t%s\t%s\n", myFriends, myFriends.getFirstName(), myFriends.getSurname(),myFriends.getYear());
    }
}
