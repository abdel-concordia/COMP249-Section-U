package comp249_section_u;

public class Person {

    // Name (String)
    private String name;
    // Age (int)
    private int age;
    // Address (String)
    private Address address;

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Default constructor
    public Person() {
        this("No name yet", 0, "No address yet"); // call the upper constructor (Sting, int, String)
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this(otherPerson.name, otherPerson.age, otherPerson.address); // Watch out!
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return this.address;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public boolean setAge(int age) {
        if (age >= 0 && age < 150) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    public String toString() {
        return "This is " + this.name + " whose age is " + this.age + " and lives in " + this.address;
    }

    // equals
    public boolean equals(Person otherPerson) { // will be improved later
        if (otherPerson == null) {
            return false;
        }
        return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    }
}
