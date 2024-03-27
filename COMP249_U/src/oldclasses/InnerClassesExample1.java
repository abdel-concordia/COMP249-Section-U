package oldclasses;

public class InnerClassesExample1 {

}

class Outer {

    // Outer class
    private int n;
    private String s;

    Inner b;

    public void f() {
        Inner b = new Inner();
        b.number = 7;
    }

    public class Inner { // inner class

        private int number;

        public void g() {
            int x = n * 2;
        }

        public class C {

        }
    }
}
