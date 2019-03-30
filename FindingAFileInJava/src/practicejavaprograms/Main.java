package practicejavaprograms;
import java.io.File;//import File Class for search & info on files
//this programs checks to see if a file exists

public class Main {

    public static void main(String[] args) {

        File x = new File("C:\\Users\\niall.LAPTOP-6FGCD18F\\OneDrive\\Chicken");
        //the constructor takes the path of the file

        if(x.exists())
            System.out.println(x.getName()+ " exist!");
        else
            System.out.println("this file Does Not Exist");
    }
}
