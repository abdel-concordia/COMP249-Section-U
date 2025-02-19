package comp249_section_u;

import old_classes.Address;

public class Person extends Object {

    // Name (String)
    protected String name;
    // Age (int)
    protected int age;
    // Address (class Address)
    protected Address address;

    // Parameterized constructor
    public Person(String name, int age, Address address) throws Exception {
        this.name = name;
        if (age < 0) {
            throw new Exception("Bad age value!");
        }
        this.address = new Address(address);
    }

    // Default constructor
    public Person() throws Exception {
        this("No name yet", 0, new Address(0, "Unknown street name", "Unknown city name")); // call the upper constructor (Sting, int, String)

    }

    // Copy constructor
    public Person(Person otherPerson) throws Exception {
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
        // Check if the parameter is null, if yes, return false
        if (otherObject == null) {
            return false;
        }
        // Check if otherObject is referencing a Person. If no, return false
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        // At this point, we are sure the object referenced by otherObject is a Person
        // Cast it to a reference of type Person
        Person otherPerson = (Person) otherObject;

        // Let's compare
        return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
    }

    public void f() {
        System.out.println("f in Person");
    }

}
