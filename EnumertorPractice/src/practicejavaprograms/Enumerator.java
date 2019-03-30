package practicejavaprograms;

public enum Enumerator {

    caoimhe ("firstborn", "27"),
    niall ("secondborn", "21"),
    rachael ("thirdborn", "20"),
    tiaran ("fourthborn", "14"),
    peter ("possibility", "12"),
    fred ("possiblity1", "10"),
    david ("possibility2","8");

    private final String birthOrder;
    private final String age;

    Enumerator(String birthOrder, String age) {
        this.birthOrder = birthOrder;
        this.age = age;
    }

    public String getBirthOrder(){
        return birthOrder;
    }

    public String getAge(){
        return age;
    }
}
