package practicejavaprograms;

public class Plant {

    //Try not to make data public, use private or protected

    //access modifiers is a way to restrict or allow access to variables and methods for us in programming. You may

    //access modifiers and classes - you can only have one class file name for e.g 'public class Car'. but you can create other classes in same file e.g 'class Vehicle'.

    //access modifiers, public, private, protected only apply to variable or instance variables

    //Bad practice -- not good practice to have public field variables -- should declare instance variable public
    public String name;

    //Acceptable practice -- if you do want to make an instance varible public then you should make it a constant -- its final -- and static - accessed through the class
    public final static int ID = 8;

    //make variable only available within the class
    private String type;

    //makes varible available within the package, sub program, and classes. Useful for child classes
    protected String size;

    //variable with no access modifier makes it accessable through same package only.
    int noOfFlowers;

    public Plant() {
        this.name = "Green Stick";
        this.type = "Palm";
        this.size = "12 inches";
    }


}
