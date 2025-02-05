package comp249_section_u;

public class Person extends Object {

    // Name (String)
    String name;
    // Age (int)
    protected int age;
    // Address (class Address)
    protected Address address;

    // Parameterized constructor
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address);
    }

    // Default constructor
    public Person() {
        this("No name yet", 0, new Address(0, "Unknown street name", "Unknown city name")); // call the upper constructor (Sting, int, String)
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

    public Address getAddress() {
        return new Address(this.address); // avoid privacy leak
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

    public void setAddress(Address address) {
        this.address = new Address(address); // watch out!!
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + " This is " + this.name + " whose age is " + this.age + " and lives in " + this.address;
    }

    // equals
    @Override
    public boolean equals(Object otherObject) { // will be improved later

        if (otherPerson == null) {
            return false;
        }
        return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    }

    public void f() {

    }

}
