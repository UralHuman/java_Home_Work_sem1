import java.util.Scanner;

public class sem_1_zadacha_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();

        // Вычисление n-го треугольного числа
        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("n-е треугольное число: " + triangularNumber);

        // Вычисление n-го факториала
        int factorial = calculateFactorial(n);
        System.out.println("n-й факториал: " + factorial);
    }

    // Метод для вычисления n-го треугольного числа
    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Метод для вычисления n-го факториала
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}