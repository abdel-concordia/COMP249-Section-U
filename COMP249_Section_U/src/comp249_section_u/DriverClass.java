package comp249_section_u;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DriverClass {

    public static void main(String[] args) {

        /*
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
        int a = 5, b = 10, c = 20;
        try {
            oos.writeInt(a);
            oos.writeInt(b);
            oos.writeInt(c);
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

         */
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
                int num = ois.readInt();
                System.out.println(num);
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
