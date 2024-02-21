package comp249_u;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        try {

            int n = getInput();

            // This one might generate an ArithmeticException
            int result = calculate(n);

            System.out.print("Y is: ");
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println("An exception was thrown.");
        } catch (InputMismatchException ime) {
            System.out.println("Your input must be an int.");
        } finally {
            System.out.println("Program is terminating.");
        }
    }

    public static int calculate(int z) throws ArithmeticException {
        int x = 10;

        int y = 10 / (z - 10);
        return y;
    }

    public static int getInput() {
        int number = 0;
        System.out.print("Please input a number: ");
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        return number;
    }
}
