public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.mult(5,5));
        System.out.println(calc.pow(3,3));
        System.out.println(calc.sum(25,25));
        System.out.println(calc.pow(0,1));
        System.out.println(calc.mult(0,0));
    }
}
