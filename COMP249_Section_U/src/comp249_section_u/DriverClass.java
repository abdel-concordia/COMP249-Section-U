package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

//        Address ad1 = new Address(300, "Sherbrook West", "Montreal");
//        Student s1 = new Student("John", 10, ad1, "123", 0.0);
//
//        Person p1 = new Person("ALi", 7, ad1);
//
//        System.out.println(p1);
        A a = new A();
        System.out.println(a.x);

        B b = new B();
        System.out.println(b.x);

        System.out.println(a.x);

    }
}

class A {

    static int x;

    public A() {
        x++;
    }

    public static void f() {

    }
}

class B extends A {

    public B() {
        x++;
    }

    @Override
    public static void f() {

    }
}
