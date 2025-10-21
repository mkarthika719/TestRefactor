public class App {
    public static void main(String[] args) {
        // Create Calculator and MathUtils objects
        Calculator calc = new Calculator();
        MathUtils utils = new MathUtils();

        // Display basic operations
        System.out.println("Sum: " + calc.add(2, 3));
        System.out.println("Difference: " + calc.subtract(5, 2));
        System.out.println("Product: " + utils.multiply(2, 3));
        System.out.println("Division: " + utils.divide(10, 2));

        // More calculations
        System.out.println("Modulo: " + utils.mod(10, 3));
        System.out.println("Power: " + utils.power(2, 5));
        System.out.println("Average: " + calc.average(4, 6));
        System.out.println("Max: " + calc.max(10, 20));
        System.out.println("Min: " + calc.min(10, 20));

        // Using loops for demonstration
        System.out.println("Sum of first 5 numbers: " + calc.sumOfNumbers(5));
        System.out.println("Factorial of 5: " + utils.factorial(5));

        // Using arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + calc.sumArray(numbers));
        System.out.println("Product of array: " + utils.productArray(numbers));
    }
}

class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public double average(int a, int b) { return (a + b) / 2.0; }
    public int max(int a, int b) { return a > b ? a : b; }
    public int min(int a, int b) { return a < b ? a : b; }
    public int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }
}

class MathUtils {
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) { return a / b; }
    public int mod(int a, int b) { return a % b; }
    public int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) result *= a;
        return result;
    }
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
    public int productArray(int[] arr) {
        int product = 1;
        for (int n : arr) product *= n;
        return product;
    }
}
