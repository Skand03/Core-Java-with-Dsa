public class swtichCaseArrow {
    public static void main(String[] args) {
        String fruits = "Blue";

        switch (fruits) {
            case "Apple" -> System.out.println("Mango");
            case "Blue" -> System.out.println("Blue");
            case "Green" -> System.out.println("Red");
            default -> System.out.println("unknown");
        }
    }
}
