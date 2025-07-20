// import java.util.*;

public class largestNumberInbuilt {

    public static int maxValue(int number[]) {
        int largest = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
                index = i;
            }
        }
        System.out.println(index);
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 55, 66, 98, 1, 2, 45, 202 };

        System.out.println("The max value of " + maxValue(number));
    }
}
