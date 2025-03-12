package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        DriverClass obj = new DriverClass();

        int[] arr = {-1, 2, 3, -4};

        System.out.println(obj.sumPositive(arr, arr.length - 1));
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
// Base case
        if (numbers.length == 1) {
            return numbers[0];
        } else {// Recursive call
            // create a smaller array with remaining values
            int[] arr = new int[numbers.length - 1];
            // Copy remaining elements to the new array
            for (int i = 1; i < numbers.length; i++) {
                arr[i - 1] = numbers[i];
            }
            // Call the method on that array
            return numbers[0] + sumArray(arr);
        }
    }

    public static int sumArray(int[] numbers, int index) {
        // Base case
        if (index == numbers.length - 1) {
            return numbers[index];
        } else { // Recursive call
            return numbers[index] + sumArray(numbers, index + 1);
        }
    }

    public static int countPositive(int[] numbers, int index) {
        // Base case
        if (index == 0) {
            return numbers[0] < 0 ? 0 : 1;
        } else {
            // Recursive call
            return numbers[index] < 0 ? countPositive(numbers, --index) : 1 + countPositive(numbers, --index);
        }
    }

    public int sumPositive(int[] numbers, int index) {
        // Base case
        if (index == 0) {
            return numbers[0] < 0 ? 0 : numbers[0];
        } else {
            // Recursive call
            return numbers[index] < 0 ? sumPositive(numbers, --index) : numbers[index] + sumPositive(numbers, --index);
        }
    }
}
