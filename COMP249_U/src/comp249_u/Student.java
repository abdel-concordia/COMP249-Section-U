package comp249_u;

public class Student extends Person {

    private String pos;
    private double gpa;

    public Student(String name, int age, Address address, String pos, double gpa) {
        super(name, age, address);
        this.pos = pos;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        super.toString();
        return "STudent data";
    }

}
