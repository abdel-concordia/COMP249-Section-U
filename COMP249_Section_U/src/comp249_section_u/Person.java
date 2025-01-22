package comp249_section_u;

public class Person {

    // Name (String)
    private String name;
    // Age (int)
    private int age;
    // Address (String)
    private String address;

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Default constructor
    public Person() {
        this("No name yet", 0, "No address yet");
    }

    // Copy constructor
}
