package comp249_section_u;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        Address ad1 = new Address(300, "Sherbrook West", "Montreal");

        Student s1 = new Student("Ali", 17, ad1, "1234", 3.4);

        Person p = new Person("John", 10, ad1);

        Person p2 = new Person(s1); // Will create copy as Person object
        Student p3 = (Student) s1.clone(); // will create a copy of Student
    }

}
