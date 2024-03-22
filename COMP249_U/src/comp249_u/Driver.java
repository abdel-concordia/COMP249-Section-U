package comp249_u;

public class Driver {

    public static void main(String[] args) {

    }

}

class A {

    private int n;
    private String s;

    B b;

    public void f() {
        B b = new B();
        b.number = 7;
    }

    public class B { // inner class

        private int number;

        public void g() {
            int x = n * 2;
        }

        public class C {

        }
    }

}
