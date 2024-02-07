package comp249_u;

public class Student extends Person {

    private String pos;
    private double gpa;

    public Student(String name, int age, Address address, String pos, double gpa) {
        super(name, age, address);
        this.pos = pos;
        this.gpa = gpa;
    }

    // Setter
    public void setPoS(String pos) {
        this.pos = pos;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public String getPoS() {
        return this.pos;
    }

    public double getGPA() {
        return this.gpa;
    }

    @Override
    public String toString() {
        super.toString();
        return "Student data " + age;
    }

    // B --> A --> Object
    public Student f() {
        g();
        return this; // new Person("Name 1", 10);
    }

    @Override
    public void g() {

    }
    // if veryImportantMethod is final in Person, the below override will give an error
/*
    @Override
    public final void veryImportantMethod(){
        // Some new code
    }
     */
}
