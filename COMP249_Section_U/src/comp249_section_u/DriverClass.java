package comp249_section_u;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DriverClass {

    public static void main(String[] args) {

        // Writing to a binary file
        // Open the file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("data.bin"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Cannot open/create the file.");
            System.exit(0);
        } catch (IOException ioex) {
            System.out.println("Cannot open the file");
            System.exit(0);
        }
        // Write to the file

        try {
            A a = new A(3);

            oos.writeObject(a);

            oos.writeObject(new A(10));

        } catch (IOException ioex) {
            System.out.println("Cannot read from file.");
            System.exit(0);
        }
        // Close the file
        try {
            oos.close();
        } catch (IOException ioex) {
            System.out.println("Cannot close the file.");
        }

        // Reading from a binary
        // Open the file for input
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("data.bin"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Cannot open the file");
        } catch (IOException ioex) {
            System.out.println("Cannot open the file");
        }
        // Read from file
        while (true) {
            try {
                A obj1 = (A) ois.readObject();

                System.out.println(obj1);
            } catch (EOFException eofex) {
                break;
            } catch (IOException ioex) {
                System.out.println("Cannot read from file.");
                break;
            }
        }

        // Close the file
        try {
            ois.close();
        } catch (IOException ioex) {
            System.out.println("Cannot close the file.");
        }

    }

}

class A implements Serializable {

    private int number;

    public A(int number) {
        this.number = number;
    }
}
