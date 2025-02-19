package comp249_section_u;

public abstract class Animal {

    protected String color;

    public Animal(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    // Abstract methods
    public abstract void move();

}
