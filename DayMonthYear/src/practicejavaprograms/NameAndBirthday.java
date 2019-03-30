package practicejavaprograms;

public class NameAndBirthday {
    private String name;
    private Calander birthday;

    public NameAndBirthday(String name, Calander birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String toString (){
        return String.format("My name is %s, my birthday is %s ", this.name, this.birthday );


    }
}
