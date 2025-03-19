package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        MyInterface obj1 = new MyInterface() { // object out of an anonymous class

            @Override
            public void f() {

            }
        };

    }

}

interface MyInterface {

    void f();
}

class A implements I { // named class

}

// Interfaces can be implemented in 3 ways:
// 1. Named class
// 2. ANonymous class
// 3. Lambda expression (search for lambda expression and functional interfaces)
