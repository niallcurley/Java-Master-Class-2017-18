package practicejavaprograms;

public class Calander {
    private int month;
    private int day;
    private int year;

    public Calander(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        System.out.printf("The constructor for this %s\n", this);
    }

    public String toString (){
        return String.format("%d/%d/%d", month, day, year);
    }
}
