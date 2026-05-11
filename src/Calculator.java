public class Calculator {

    // Método de clase
    // No se requiere crear instancias de la clase para ejecutar el método
    public static void execute(int a, int b, char operator) {
        int result = 0;

        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> throw new AssertionError();
        }
        System.out.println("Result is: " + result);

    }

    public static void displayEvenNumbers(int start, int end) {

        while (start <= end) {
            if (start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        }

    }
}
