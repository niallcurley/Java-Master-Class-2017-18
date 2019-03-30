package practicejavaprograms;

public class Main {

    public static void main(String[] args) {


        FinalPractice p1 = new FinalPractice(10);

        for(int x = 1; x < 5; x++){
            p1.add();
            //System.out.println(p1.toString());
            System.out.printf("%s",p1);

        }


    }
}
