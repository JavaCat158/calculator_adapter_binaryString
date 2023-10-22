public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String num1 = "101";
        String num2 = "1101";

        String sumResult = bins.sum(num1, num2);
        String multResult = bins.mult(num1, num2);

        System.out.println("Sum: " + sumResult);
        System.out.println("Multiplication: " + multResult);
    }
}
