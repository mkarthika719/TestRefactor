public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        MathUtils utils = new MathUtils();

        System.out.println("Sum: " + calc.add(2, 3));
        System.out.println("Difference: " + calc.subtract(5, 2));
        System.out.println("Product: " + utils.multiply(2, 3));

        System.out.println("Division: " + utils.divideSafe(10, 2));
        System.out.println("Modulo: " + utils.modSafe(10, 3));

        System.out.println("Power: " + utils.power(2, 5));
        System.out.println("Average: " + calc.average(4, 6));
        System.out.println("Max: " + calc.max(10, 20));
        System.out.println("Min: " + calc.min(10, 20));

        System.out.println("Sum of first 5 numbers: " + calc.sumOfNumbers(5));
        System.out.println("Factorial of 5: " + utils.factorial(5));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array: " + calc.sumArray(numbers));
        System.out.println("Product of array: " + utils.productArray(numbers));
        System.out.println("Max of array: " + calc.maxArray(numbers));
        System.out.println("Min of array: " + calc.minArray(numbers));
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

    public int maxArray(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public int minArray(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }
}

class MathUtils {
    public int multiply(int a, int b) { return a * b; }

    public int divideSafe(int a, int b) {
        return b != 0 ? a / b : 0; // safe division
    }

    public int modSafe(int a, int b) {
        return b != 0 ? a % b : 0; // safe modulo
    }

    public int power(int a, int b) {
        return (int) Math.pow(a, b); // cleaner
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
