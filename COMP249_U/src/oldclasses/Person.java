package oldclasses;

import oldclasses.Address;

public class Person {

    // ------ Data ATtributes
    // Name: String
    String name;
    // Age: int
    protected int age;
    //Address: String
    protected Address address;

    // ------ Constructors
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age, int streetNumber,
            String streetName, String zipCode, String cityName) {
        this(name, age, new Address(streetNumber, streetName, zipCode, cityName));
        //this.name = name;
        //this.age = age;
        //this.address = new Address(streetNumber, streetName, zipCode, cityName);
    }

    public Person(String name, int age) {
        this(name, age, new Address());
    }

    /*
    public Person() {
        this("", 0, new Address());
    }
     */
    public Person(Person otherPerson) {
        this(otherPerson.name, otherPerson.age, new Address(otherPerson.address));

    }

    // ------ Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setADdress(Address address) {
        this.address = address;
    }

// ------ Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Address getAddress() {
        return this.address;
    }

// ------ toString
    @Override
    public String toString() {
        return this.name + " living in " + this.address + " and their age is: " + this.age;
    }

    protected Person f() {
        return this;
    }

    public void g() {
        f();
    }

    public final void veryImportantMethod() {
        // SOme code that should never be modified by derived classes
    }

    @Override
    protected Person clone() {
        return new Person(this);
    }

}
