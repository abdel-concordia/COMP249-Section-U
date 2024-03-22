package oldclasses;

public class AnonymousclassExample1 {

    I x = new I() { // Anonymous class
        private int number;

        @Override
        public void display() {
            System.out.println("From the anonymous class.");
        }
    };

    I y = new A();

    //x.display ();
    // y.display ();
}

interface I {

    public void display();
}

class A implements I { // Named class

    @Override
    public void display() {
        System.out.println("From the named class");
    }
}
