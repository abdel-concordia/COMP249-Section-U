package comp249_u;

public class Student extends Person {

    private String pos;
    private double gpa;

    public Student(String name, int age, Address address, String pos, double gpa) {
        super(name, age, address);
        this.pos = pos;
        this.gpa = gpa;
    }

    public Student(Student student) {
        this(student.name, student.age, student.address, student.pos, student.gpa);
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
        return super.toString() + ", student gpa " + gpa;
    }

    // B --> A --> Object
    @Override
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
    @Override
    public boolean equals(Object otherObject) {
        // Check if the parameter is null (return false)
        if (otherObject == null) {
            return false;
        }
        // Check if otherObject is of the type of this clss (return false)
        // instanceof: NEVER USE IT in equals
        // getClass()
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }

        // Do the comparison
        Student otherStudent = (Student) otherObject;
        return ((this.pos.equals(otherStudent.pos) && this.gpa == otherStudent.gpa)
                && (this.address.equals(otherStudent.address)));

    }

    @Override
    protected Student clone() {
        return new Student(this);
    }
}
