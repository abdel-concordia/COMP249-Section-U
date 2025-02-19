package old_classes;

public class Fish extends Animal {

    public Fish(String color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("I swim");
    }
}
