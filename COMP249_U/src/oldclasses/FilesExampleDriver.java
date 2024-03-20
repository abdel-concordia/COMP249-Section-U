package oldclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesExampleDriver {

    public static void main(String[] args) {

        // Reading from a file
        Scanner myScanner = null;
        try {
            myScanner = new Scanner(new FileInputStream("output.txt"));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Could not open the file to read from it.");
            System.exit(0);
        }

        while (myScanner.hasNextLine()) {
            String s = myScanner.nextLine();
            System.out.println(s);
        }
        // Close the scanner
        myScanner.close();
        /* // Writing to file
        PrintWriter myStream = null;
        try {
            myStream = new PrintWriter(new FileOutputStream("output.txt")
            );
        } catch (FileNotFoundException fnfe) {
            System.out.println("Could not open/reate the file.");
            System.exit(0);
        }

        myStream.print("Hello");

        // close
        myStream.close();
         */
    }
}
