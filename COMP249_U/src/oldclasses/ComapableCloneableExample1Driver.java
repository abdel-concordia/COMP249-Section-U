package oldclasses;

public class ComapableCloneableExample1Driver {

    public static void main(String[] args) {
        A a = new A(20);
        A x = new A(20);

        System.out.println(a.compareTo(x));

        System.out.println(
                "value in a " + a.getNumber());

        try {
            A b = (A) a.clone();
            System.out.println("value in b " + a.getNumber());

        } catch (CloneNotSupportedException cnfex) {
            System.out.println("Cannot clone " + cnfex.getMessage());
        }
    }
}

class A implements Cloneable, Comparable {

    private B b;
    private C c;
    private int n;

    public A(int n) {
        b = new B();
        c = new C();
        this.n = n;
    }

    public int getNumber() {
        return this.n;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        A copy = (A) super.clone();
        copy.b = (B) b.clone();
        copy.c = (C) c.clone();
        copy.n = n;

        return copy;
    }

    @Override
    public int compareTo(Object otherObject) {

        A otherA = (A) otherObject;

        if (this.n < otherA.n) {
            return -1;
        } else if (this.n == otherA.n) {
            return 0;
        } else {
            return 1;
        }
    }
}

class B implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        B copy = (B) super.clone();
        return copy;
    }
}

class C implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        C copy = (C) super.clone();
        return copy;
    }
}
