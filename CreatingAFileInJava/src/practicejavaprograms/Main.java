package practicejavaprograms;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        final Formatter x;

        try {
            x = new Formatter("manchester.txt");
            System.out.println("You created a file called ");
        }
        catch (Exception e){
            System.out.println("there is an error");
        }

    }
}
