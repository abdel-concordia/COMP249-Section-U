package oldclasses;

public class BadCreditPointsException extends Exception {

    private double minimumCreditPoints;
    private double maximumCreditPoints;

    public BadCreditPointsException(String message, double minimumCreditPoints, double maximumCreditPoints) {
        super(message);
        this.minimumCreditPoints = minimumCreditPoints;
        this.maximumCreditPoints = maximumCreditPoints;
    }

    public double getMaximumCreditPoints() {
        return this.maximumCreditPoints;
    }

    public double getMinimumCreditPoints() {
        return this.minimumCreditPoints;
    }
}
