package problemSolving;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

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
