package practicejavaprograms;

public enum Enumerator {
    //enum is used instead of class

    Coracle1 ("Mark","Beattie","1972" ),
   Coracle2 ("John","Curley", "1966"),
   Coracle3 ("Patrick","Shields","1978"),
   Coracle4 ("Thomas","O Neill", "1975"),
   Coracle5 ("Gregory","Reid", "1980"),
    Coracle6 ("Harold","Templeton","1972");


    private final String firstName;
    private final String surname;
    private final String year;


    Enumerator(String firstName, String surname, String year) {
        this.firstName = firstName;
        this.surname = surname;
        this.year = year;
    }

    public String getSurname(){
        return surname;

    }

    public String getFirstName(){
        return firstName;
    }

    public String getYear(){
        return year;
    }
}
