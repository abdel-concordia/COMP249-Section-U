package oldclasses;

public class OwnExceptionClassDriver {

    public static void main(String[] args) {

        Course c = null;
        try {
            c = new Course("COMP 249", -2);
        } catch (BadCreditPointsException bcpe) {
            System.out.println("Problem creating a Course object." + bcpe.getMessage());
            System.out.println(bcpe.getMinimumCreditPoints());
            System.out.println(bcpe.getMinimumCreditPoints());

            System.exit(0);
        } catch (Exception ex) {

        }

        // Code after
        System.out.println(c.toString());
    }
}
