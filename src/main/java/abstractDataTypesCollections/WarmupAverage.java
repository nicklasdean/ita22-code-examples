package abstractDataTypesCollections;

public class WarmupAverage {

    public static void main(String[] args) {
        int[] threeNumbers = {1,2,3};
        int[] fiveNumbers = {1,2,3,4,5};

        averageArray(threeNumbers);
        averageArray(fiveNumbers);
    }

    public static double averageArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        return average;
    }
}