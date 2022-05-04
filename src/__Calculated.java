import java.util.Scanner;

public class __Calculated {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char calculatorOperation = 'C';

        double val1;
        double val2;
        char operation;
        double resuit = 0;

        do {
            if (calculatorOperation == 'C') {

                System.out.println("Введите первое число");

                val1 = sc.nextInt();

                System.out.println("Введите операцию");

                operation = sc.next().charAt(0);

// calculatorOperation - отвечает за сброс по вводу "С", и по выключению по вводу "S".
                //operation - используется для выполнения арефмитических действий передающиеся в result = calculated(val1, operation, val2)

            } else {
                val1 = resuit;

                operation = calculatorOperation;
            }
            System.out.println("Введите второе число");
            val2 = sc.nextInt();

            resuit = calculated(val1, operation, val2);

            System.out.println(resuit);

            calculatorOperation = sc.next().charAt(0);


        } while (calculatorOperation != 'S');
    }

    private static double calculated(double val1, char operation, double val2) {
        return switch (operation) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> {
                System.out.println("Incorrect operand input. Неправельный ввод операнда.");
                yield 0;
            }
        };

    }

}

