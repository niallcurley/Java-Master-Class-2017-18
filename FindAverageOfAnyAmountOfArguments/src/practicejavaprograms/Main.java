package practicejavaprograms;

public class Main {
     String names;


    public static int averageOfNumbers (int...numbers){//...these 3 dots are called an elipse - this means your not restricted to a certain number of arguments.

        int total = 0;
        for (int x : numbers)
            total+=x;

        return total/numbers.length;
    }

    public static String[] listsOfNames(String...names){

        return names;
    }

    public static void main(String[] args) {

        System.out.println(averageOfNumbers(44,66,22,88,44));
        System.out.println(listsOfNames("harry","susan"));



    }
}
