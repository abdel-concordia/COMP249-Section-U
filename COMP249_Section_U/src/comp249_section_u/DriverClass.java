package comp249_section_u;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        /*
        // Create the PrintWriter stream
        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileOutputStream("myfile.txt"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Cannot open the file for writing.");
            System.exit(0);
        }
        // Write
        output.print("Hello");
        output.println(" World");
        output.print("Hi");
        // Close
        output.close();
         */
        // Create the Scanner
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream("myfile.txt"));
        } catch (FileNotFoundException fnfex) {
            System.out.println("Cannot open the input file.");
        }
        // Read
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(s);
        }
        // Close
        sc.close();

    }

}
