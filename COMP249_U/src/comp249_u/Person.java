package comp249_u;

public class Person {

    // ------ Data ATtributes
    // Name: String
    private String name;
    // Age: int
    private int age;
    //Address: String
    private String address;

    // ------ Constructors
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
        this.name = "";
        this.age = 0;
        this.address = "";
    }

    // ------ Setters
    // ------ Getters
    // ------ toString
}
