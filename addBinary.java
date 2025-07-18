public class addBinary {
    public static void main(String[] args) {
        String binaryNumber = "11";
        String addNumber = "1";
        int total = Integer.parseInt(binaryNumber, 2) + Integer.parseInt(addNumber);
        System.out.println(total);

        String decimalnumber = Integer.toBinaryString(total);
        System.out.println(decimalnumber);
    }
}
