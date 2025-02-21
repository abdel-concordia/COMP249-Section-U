package comp249_section_u;

public class AgeException extends Exception {

    final private int MIN_AGE = 0;
    final private int MAX_AGE = 140;

    public AgeException(String message) {
        super(message);
    }

    public int getMinAge() {
        return this.MIN_AGE;
    }

    public int getMaxAge() {
        return this.MAX_AGE;
    }

}
