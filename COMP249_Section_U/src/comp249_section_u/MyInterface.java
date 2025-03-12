package comp249_section_u;

public interface MyInterface {

    int num = 7; // final, static

    void f1(); // it is abstract by default, public

    default void f2() {
        System.out.println("Default implementation in MyInterface");
    }
}
