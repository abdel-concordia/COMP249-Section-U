package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        final int NUMBER_OF_ANIMALS = 3;
        Animal[] animals = new Animal[NUMBER_OF_ANIMALS];

        // animals[0] = new Animal("Yellow"); // Cannot create objects out of an Abstract class
        animals[0] = new Bird("Green", 7);
        animals[1] = new Bird("Multi", 9);
        animals[2] = new Fish("Gray");

        for (int i = 0; i < NUMBER_OF_ANIMALS; i++) {
            animals[i].move();
        }

        // Enhanced loop
        for (Animal a : animals) {
            a.move();
        }
    }

}
