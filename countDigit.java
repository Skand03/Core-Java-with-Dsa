package Loops;

public class countDigit {
    public static void main(String[] args) {
        int count = 0;
        int n = 44667;
        while(n>0){
            int lastDigit = n%10;
            count = count + 1;
            n = n/10;
            System.out.print(count);
        }
    }
}
