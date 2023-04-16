import java.util.Scanner;

public class sem_1_zadacha_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;

        System.out.println("Простой калькулятор");
        System.out.println("--------------------");
        System.out.println("Поддерживаемые операции: +, -, *, /");
        System.out.println("--------------------");

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();

        // Ввод оператора
        System.out.print("Введите оператор (+, -, *, /): ");
        operator = scanner.next();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        // Выполнение операции и вывод результата
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            default:
                System.out.println("Ошибка: недопустимый оператор");
                break;
        }

        scanner.close();
    }
}