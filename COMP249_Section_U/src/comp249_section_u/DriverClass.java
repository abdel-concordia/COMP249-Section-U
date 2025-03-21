package comp249_section_u;

import java.util.ArrayList;
import java.util.Collections;

public class DriverClass {

    public static void main(String[] args) {

        ArrayList<A> objects = new ArrayList<>(5); // 5: initial capacity, not the LIMIT

        objects.add(new A(5)); // appends
        objects.add(new A(2)); // inserts the object at the specified position

        System.out.println("Before sorting");
        for (A s : objects) {
            System.out.println(s);
        }

        Collections.sort(objects); // How to sort A objects

        System.out.println("After sorting");

        for (A s : objects) {
            System.out.println(s);
        }

        //System.out.println(strings);
    }

}

class A implements Comparable {

    private int x;
    private int y;

    public A(int x) {
        this.x = x;
    }

    @Override
    public int compareTo(Object otherObject) {

        A otherA = (A) otherObject; // Be carefull (if cast is not possible, this will throw an exception)

        if (this.x < otherA.x) {
            return -1;
        } else if (this.x > otherA.x) {
            return 1;
        } else {
            return 0;
        }
    }

}


// If you need multiple ways to compare in the spame program, use the Comparator interface (compare)
