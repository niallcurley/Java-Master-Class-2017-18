package practicejavaprograms;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String [] aStringArray = {"Apple", "Banana", "Tomato"};
        String aString = Arrays.toString(aStringArray);//keypart of coding creating a object Arrys and toSting method.
        System.out.println(aString);


        String [] thisStringArray = {"Apple", "Banana","Pinapple"};
        String theString = Arrays.toString(thisStringArray);
        System.out.println(theString);

        //converting a String Array to a list
        String [] thisIsAStringArray = {"Apple","Berries","Pears"};
        List<String> stringList = Arrays.asList(thisIsAStringArray);//keypart of coding List<String>stringList - Arrays.asList
        System.out.println(stringList);


    }
}
