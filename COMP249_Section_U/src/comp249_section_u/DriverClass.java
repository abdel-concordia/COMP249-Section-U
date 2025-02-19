package comp249_section_u;

import old_classes.Address;

public class DriverClass {

    public static void main(String[] args) {

        Address ad = new Address(123, "Sherbrooke", "Montreal");

        try {
            System.out.println("Before call to constructor");
            Person p = new Person("John", 10, ad);
            System.out.println("After call to constructor");
            int x = 5;
            int y = 0;
            int z = x / y;
        } catch (ArithmeticException aex) {
            System.out.println("Canno do the division: " + aex.getMessage());
        } catch (Exception ex) {
            System.out.println("Cannot create person: " + ex.getMessage());
        }

    }

}
