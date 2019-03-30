package practicejavaprograms;

public class FinalPractice {

    private int sum;
    private final int NUM;

    public FinalPractice(int NUM) {

        this.NUM = NUM;
    }

    public void add (){
        sum+=NUM;
    }

    public String toString() {
        return String.format("Sum = %d\n", sum);
    }
}
