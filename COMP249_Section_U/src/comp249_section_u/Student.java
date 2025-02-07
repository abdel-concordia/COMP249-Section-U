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
    @Override
    public boolean equals(Object otherObject) {
        // CHeck if parameter is null
        if (otherObject == null) {
            return false;
        }

        // Check if otherObject is referencing an object Student
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        // Cast
        Student otherStudent = (Student) otherObject;

        // Compare (Note: == is not good to compare doubles)
        // Do the subtraction and see if it is too small (smaller than a threshold)
        final double THRESHOLD = 0.000001;
        return (Math.abs(this.gpa - otherStudent.gpa)) < THRESHOLD;

    }

    // toString
    @Override
    public String toString() {
        return "This is " + this.name + " who is a Student with ID " + this.ID + " and GPA = " + this.gpa;
    }

    @Override
    public void f() {

    }

}
