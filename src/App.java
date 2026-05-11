public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Luis", 12);
        student.printStatus();

        Calculator.execute(5, 20, '*');

        Calculator.displayEvenNumbers(5, 10);
    }
}
