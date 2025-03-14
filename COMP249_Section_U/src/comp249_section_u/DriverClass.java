package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        X x1 = new X();
        X x2 = new X(x1);

        Y y1 = new Y();
        Y y2 = new Y(y1);

        Z z1 = new Z();

        new X(x1); // creates an object of X
        new X(y1); // creates an object of X
        new X(z1); // creates an object of X

        x1.clone(); // creates an object of X
        y1.clone(); // creates an object of Y
        z1.clone(); // creates an object of Z

        X x3 = z1;

        x3.clone(); // Creates an object of Z

        yn.clone(); // create an object of ???
    }

}

class X {

    public X() {

    }

    public X(X o) {

    }
}

class Y extends X {

    public Y() {

    }

    public Y(Y o) {

    }
}

class Z extends Y {

}

class A implements Cloneable {

    int x; // primitive type

    @Override
    public Object clone() throws CloneNotSupportedException {
        A cp = (A) super.clone();
        cp.x = this.x;
        return cp;
    }
}

class C implements Cloneable {

    int z; // primitive type
    A obj; // Reference type, mutable

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Clone with super
        C cp = (C) super.clone();
        // Clone what the class added
        cp.z = this.z;
        cp.obj = (A) this.obj.clone();

        // return the created object
        return cp;
    }
}
