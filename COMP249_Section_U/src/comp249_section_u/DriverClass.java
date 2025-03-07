package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        System.out.println(sumDown(-4));
    }

    public static void countDown(int n) { // Assumption: n is positive
        // Base case
        if (n == 0) {
            System.out.println(0);
        } // Recursive call
        else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    public static void countUp(int n) {
        // Base case
        if (n == 0) {
            System.out.println(0);
        } // Recursive call
        else {
            countUp(n - 1);
            System.out.println(n);
        }
    }

    public static int sumDown(int n) {
        // Base case
        if (n <= 0) {
            return 0;
        } // Recursive call
        else {
            return n + sumDown(n - 1);
        }
    }

    public static int sumArray(int[] numbers) {

    }
}
