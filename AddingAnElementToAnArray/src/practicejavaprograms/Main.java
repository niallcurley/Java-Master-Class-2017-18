package practicejavaprograms;

public class Main {

    public static void main(String[] args) {

       String [] aStringArray = {"Apple", "Banana", "Orange"};//array declared and initialized
        //aStringArray.length + 1
        String [] tempArray = new String [aStringArray.length +1];

        for(int i=0; i<aStringArray.length; i++){
            tempArray [i] = aStringArray [i];
        }

        tempArray[aStringArray.length]= "Carrots";
        aStringArray = tempArray;

        for (String element:aStringArray){
            System.out.println(element);
        }
    }
}
