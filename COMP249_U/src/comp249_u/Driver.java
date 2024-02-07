package comp249_u;

public class Driver {

    public static void main(String[] args) {

        Student s = new Student("John", 17,
                new Address(123, "Peel", "H3G", "Montreal"),
                "Comp Science", 4.2);

        System.out.println(s.toString());

        System.out.println(s.getClass());
        Person p = s;

        System.out.println(p.getClass());

        Object o = p;
        System.out.println(o.getClass());

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
