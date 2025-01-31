package comp249_section_u;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        Address ad1 = new Address(300, "Sherbrook West", "Montreal");
        Student s1 = new Student("John", 10, ad1, "123", 0.0);

        Person p1 = new Person("ALi", 7, ad1);

        System.out.println(p1);

    }

}
