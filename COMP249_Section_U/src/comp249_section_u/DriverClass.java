package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

    }

}

class A {

    private int x;

    public void f() {

    }

    class B {

        void g() {
            f(); // this calls f in B
            A.this.f(); // this calls f in A
        }

        void f() {

        }

    }
}

class C extends B {

}
