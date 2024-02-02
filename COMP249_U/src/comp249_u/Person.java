package comp249_u;

public class Person {

    // ------ Data ATtributes
    // Name: String
    private String name;
    // Age: int
    private int age;
    //Address: String
    private Address address;

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

}
