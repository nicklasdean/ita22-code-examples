package conditionalsSwitchMethods;

public class StaticMethods {
    public static void main(String[] args) {
        int sum = sum(2,2);
        System.out.println(sum);
    }

    //Displaying the sum of two numbers
    public static int sum(int first, int second){
        return (first + second);
    }
}
