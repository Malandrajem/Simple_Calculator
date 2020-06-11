import java.util.Scanner;

public class Calculator1 {
    static Scanner scanner = new Scanner(System.in);
    private static int x;                             // не понял почему это вылетело сюда?
    private static int y;

    public static void main(String[] args) {

        int x = getInt(); // первое значение
        int y = getInt(); // второе значение
        char operation = getOperation(); 
        int result = calc(x, y, operation);
        System.out.println("Ответ: " + result);       // выводит результат на экран
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int x = 0;
        if (scanner.hasNextInt()) {
            x = scanner.nextInt();                   // сканирует правильность ввод, если всё ок пропускает дальше
        }
        return x;
    }

    public static char getOperation() {
        System.out.println("Введите метод:");
        char operation = 0;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static int calc(int x, int y, char operation) {     //сам калькулятор
        int result;
        switch (operation) {
            case '+' -> result = x + y;
            case '-' -> result = x - y;
            case '*' -> result = x * y;
            case '/' -> result = x / y;
            default -> {
                System.out.println("Ответ: ");
                result = calc(x, y, getOperation());
            }
        }
        return result;
    }
}