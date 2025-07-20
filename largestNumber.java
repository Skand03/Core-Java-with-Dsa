public class largestNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 9, 6 };
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max + " The index number is " + maxIndex);
    }

}
