package comp249_section_u;

public class DriverClass {

    public static void main(String[] args) {

        Address ad1 = new Address(300, "Sherbrook West", "Montreal");
        Person p1 = new Person("John", 20, ad1);

        p1.getAddress().setCityName("Quebec");

        // Change city name of p1
        Address ad2 = p1.getAddress();
        ad2.setCityName("Quebec");
        p1.setAddress(ad2);

        System.out.println(p1.getAddress());
    }

}
