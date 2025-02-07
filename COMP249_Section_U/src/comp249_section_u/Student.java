package comp249_section_u;

public class Student extends Person {

    // Name
    // Age
    // Address
    // ID
    private String ID;
    // GPA
    private double gpa;

    // Constructors
    public Student(String name, int age, Address address, String ID, double gpa) {
        // Construct the inherited part (call Person constructor)
        super(name, age, address);

        // COnstruct the part added by Student
        this.ID = ID;
        this.gpa = gpa;
    }

    public Student(String ID, double gpa) {
        // super();
        this.ID = ID;
        this.gpa = gpa;
    }

    // Getters
    public String getID() {
        return this.ID;
    }

    public double getGPA() {
        return this.gpa;
    }

    // Setters
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // equals
    // toString
    @Override
    public String toString() {
        return "This is " + this.name + " who is a Student with ID " + this.ID + " and GPA = " + this.gpa;
    }

    @Override
    public void f() {

    }

}
