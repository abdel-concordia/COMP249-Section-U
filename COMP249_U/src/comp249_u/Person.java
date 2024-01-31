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

    public Person(String name, int age) {
        this(name, age, "");
    }

    public Person() {
        this("", 0, "");
    }

    public Person(Person otherPerson) {
        this(otherPerson.name, otherPerson.age, otherPerson.address);
    }

    // ------ Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setADdress(String address) {
        this.address = address;
    }

// ------ Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

// ------ toString
    @Override
    public String toString() {
        return this.name + " living in " + this.address + " and their age is: " + this.age;
    }
}
