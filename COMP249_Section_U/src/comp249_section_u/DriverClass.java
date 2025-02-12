package comp249_section_u;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        Address ad1 = new Address(300, "Sherbrook West", "Montreal");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");

        int number = sc.nextInt();

        Person p1;
        if (number < 10) {
            p1 = new Person("John", 10, ad1);
        } else {
            p1 = new Student("Ali", 17, ad1, "1234", 3.4);
        }

        // p1 is referncing what????
        p1.f();
    }
}
