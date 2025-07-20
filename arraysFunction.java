public class arraysFunction {

    public static void update(int marks[], int nonChange) {
        nonChange = 15;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 99, 98, 97 };
        int nonChange = 5;
        update(marks, nonChange);
        System.out.println(nonChange);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

}
