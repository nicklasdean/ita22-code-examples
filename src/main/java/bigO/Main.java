package bigO;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int numberOfInputs = 100000;
        ArrayList<Integer> inputArray = new ArrayList<Integer>(Collections.nCopies(numberOfInputs, 0));
        //constantTime(inputArray);
        //linearTime(inputArray);
        /*quadraticTime(inputArray);*/

        // names we say is an ArrayList
        int number = inputArray.get(0);
        System.out.println(number);
    }

   public static void constantTime(ArrayList<Integer> numbers) {
        System.out.println("Started");
        numbers.get(0);
        System.out.println("Finished");
    }

    public static void linearTime(ArrayList<Integer> numbers) {
        System.out.println("Started");
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            counter++;
        }
        System.out.println("Finished");
    }

    public static void quadraticTime(ArrayList<Integer> numbers) {
        System.out.println("Started");
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                for (int k = 0; k < numbers.size(); k++) {
                    counter++;
                }
            }
        }
        System.out.println("Finished");
    }


}
