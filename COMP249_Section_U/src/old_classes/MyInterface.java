package old_classes;

public interface MyInterface {

    int num = 7; // final, static

    void f1(); // it is abstract by default, public

    default void f2() {
        System.out.println("Default implementation in MyInterface");
    }
}

interface MyInterface2 extends MyInterface {

}
