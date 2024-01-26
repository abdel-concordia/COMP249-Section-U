package comp249_u;

public class Driver {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", 19, "Montreal");

        System.out.println(p1);
        System.out.println(p1);

    }

    public void someMethod(Person p) {
        //p.setName("New name");

        p = new Person("BlaBlah", 5, "Laval");

    }
}
