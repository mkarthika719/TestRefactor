public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(2, 3));
        System.out.println("Product: " + MathUtils.multiply(2, 3));
    }
}