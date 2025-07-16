package Loops;

public class CountLettersDigitsSpacesWithoutInbuiltMethods {
    public static void main(String[] args) {
        String name = "Jai jaggarnath - + % sxsccc  v   8 9 6 1 ";

        int digitNumber=0;
        int symbolCount=0;
        int letterCount=0;
        int spaceCount=0;

        for(int i = 0; i<name.length();i++){
            char c = name.charAt(i);

            if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' ){
                letterCount++;
            } else if (c >= '0' && c <= '9' ) {
                digitNumber++;
            } else if (c == ' ') {
                spaceCount++;
            }else{
                symbolCount++;
            }
        }
        System.out.println("The Letter of name is " + letterCount);
        System.out.println("The Digit of name is " + digitNumber);
        System.out.println("The Space of name is " + spaceCount);
        System.out.println("The Symbol of name is " + symbolCount);
    }
}
