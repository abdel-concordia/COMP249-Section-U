package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        Address ad1 = new Address(300, "Sherbrook West", "Montreal");

        Object s1 = new Student("Ali", 17, ad1, "1234", 3.4);

        String s = s1.getName();

    }
}
