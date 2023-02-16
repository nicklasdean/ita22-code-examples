package problemSolving;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("hej");
        System.out.println(getDoubleString("hej"));
    }

    public static String getDoubleString(String stringToDouble) {
        String result = "";
        for (int i = 0; i < stringToDouble.length(); i++) {
            // Print current character
            //System.out.println(stringToDouble.charAt(i));
            char currentCharacter = stringToDouble.charAt(i);
            for (int j = 0; j < 2; j++) {
                //System.out.println(j);
                result += currentCharacter;
            }

        }

        return result;
    }






    public ArrayList<ArrayList<Integer>> getTwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int count = 1;

        for (int i = 0; i < numberOfRows; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < numberOfColumns; j++) {
                row.add(count++);
            }
            arr.add(row);
        }

        return arr;
    }
}
