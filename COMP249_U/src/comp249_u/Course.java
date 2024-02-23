package comp249_u;

public class Course {

    private String title; // title should never be empty
    private double creditPoints; // creditPoints should be between 0 and 4 (inclusive)

    public Course(String title, double creditPoints) throws Exception, BadCreditPointsException {

        if (title.equals("")) {
            throw new Exception("Bad course title. Title cannot be empty.");
        }
        this.title = title;

        if (creditPoints < 0 || creditPoints > 4) {
            throw new BadCreditPointsException("Bad credit points. Credit point should be between 0 and 4.", 0, 4);
        } else {
            this.creditPoints = creditPoints;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(double creditPoints) {
        this.creditPoints = creditPoints;
    }

    @Override
    public String toString() {
        return "Course " + this.title + " and CP " + this.creditPoints;
    }
}
