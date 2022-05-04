import java.util.Scanner;

public class Calculated_PROBA {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Бесконечный цикл получился while (true) {}
         while (true) {
        //while (scanner.hasNextInt('S')) {
            int num1 = number();
            char op = operation();
            int num2 = number();
            int result = calculated(num1, num2, op);

            System.out.println(result);
            //char grade = S;


        }
    }

    public static int number() {
        System.out.printf("Вводите число ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка! Попробуйте еще раз. ");
            scanner.next();
            num = number();
        }
        return num;
    }

    public static char operation() {
        System.out.println("Введите операцию ");
        {
            char op;
            if (scanner.hasNext()) {
                op = scanner.next().charAt(0);
            } else {
                System.out.println("Ошибка! Попробуйте еще раз. ");
                scanner.next();
                op = operation();
            }
            return op;
        }
    }

    public static int calculated(int num1, int num2, char op) {
        while (true) {
            int result;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Не найден оператор! ");
                    result = calculated(num1, num2, operation());
            }
            return result;
        }
    }
}

