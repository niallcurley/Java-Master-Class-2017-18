package practicejavaprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
     //exception handling is when you want to prevent stack trace
    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open file");
        }
    }

    public static void openFile () throws FileNotFoundException {
        File file = new File("test.txt");


            FileReader fr = new FileReader(file);


    }

}
