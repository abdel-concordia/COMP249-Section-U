package comp249_u;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Person s1;
        System.out.println("PLease input a number :");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        if (selection == 0) {
            s1 = new Student("John", 17,
                    new Address(123, "Peel", "H3G", "Montreal"),
                    "Comp Science", 4.2);
        } else {
            s1 = new Person("Suzan", 16);
        }

        s1.g();

        Student s2 = new Student("John", 17,
                new Address(123, "Peel", "H3G", "Montreal"),
                "Comp Science", 4.2);

        if (s1.equals(s2)) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }

        Person s3 = new Person(s1);

        Person s4 = s1.clone();

        //System.out.println(s instanceof Student); // getClass()
        //System.out.println(s instanceof Person);
        //System.out.println(s instanceof Object);
        //Address p1Address = new Address(1455, "Maisonneuve West", "H3G", "Montreal");
        //Person p1 = new Person("Peter", 19, p1Address);
        //Person p1 = new Person("Peter", 19, new Address(1455, "Maisonneuve West", "H3G", "Montreal"));
        //Person p1 = new Person("Peter", 19, 1455, "Maisonneuve West", "H3G", "Montreal");
        //Person p2 = new Person(p1); // Deep copy
        //p2.getAddress().setCityName("Sherbrooke");
        //System.out.println("p1 lives in: " + p1.getAddress().getCityName());
        //System.out.println("p2 lives in: " + p2.getAddress().getCityName());
    }
}
