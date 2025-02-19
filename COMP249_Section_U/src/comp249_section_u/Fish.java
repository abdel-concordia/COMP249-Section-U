package comp249_section_u;

public class Fish extends Animal {

    public Fish(String color) {
        super(color);
    }

    @Override
    public void move() {
        System.out.println("I swim");
    }
}
