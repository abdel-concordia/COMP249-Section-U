package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        Address ad1 = new Address(300, "Sherbrook West", "Montreal");

        Person p1 = new Person("John", 20, ad1);

        Student s1 = new Student("Ali", 17, ad1, "1234", 3.4);

        boolean b = p1.equals(new String());

    }
}

class A {

    int x;
}

class B extends A {

    int y;
}

class C extends B {

    int z;
}
