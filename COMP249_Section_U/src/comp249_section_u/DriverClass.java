package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        A o1 = new A();
        MyInterface o2 = new A();
        MyInterface o3 = new B();

        MyInterface[] objs = new MyInterface[4];
        objs[0] = o1;
        objs[1] = o2;
        objs[2] = o3;
        objs[3] = new C();

    }

    public static void g(MyInterface obj) {

    }
}

class A implements MyInterface {

    @Override
    public void f1() {
        // something
    }

    public void f5() {

    }
}

class B implements MyInterface {

    @Override
    public void f1() {
        // something
    }

    public void f6() {

    }
}

class C implements MyInterface {

    @Override
    public void f1() {
        // something
    }

}
