public class linearSearch {

    public static int linearCheck(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 22, 44, 5, 6, 8, 1, 2 };
        int key = 2;

        int index = linearCheck(number, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("The number at " + index + " The value of number is " + number[index]);
        }

    }
}
