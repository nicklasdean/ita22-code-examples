package abstractDataTypesCollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        //Refer to the file I want to read
        File alice = new File("src/main/java/abstractDataTypesCollections/alice-in-wonderland.txt");

        System.out.println(alice.canRead());
        //A scanner with the file
        Scanner bookScanner = new Scanner(alice);

        //Printing each word
        while(bookScanner.hasNext()){
            System.out.println(bookScanner.next());
        }
    }
}
