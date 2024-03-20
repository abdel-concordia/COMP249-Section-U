package comp249_u;

public interface MyInterface1 {

    // f is an abstract method
    public void f();

    // g is abstract BUT it has a default implementation
    default public int g() {
        return 5;
    }

}
