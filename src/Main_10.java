//Напишите метод, который будет проверять, корректно ли пользователь ввёл полное имя.
//Нужно будет проверить, что во введённой строке 3 слова (если имя, фамилия или отчество пишутся через дефис, то это считается за одно слово). Если пользователь ввёл имя некорректно, например в нём 2 или 4 и более слов, то вывести сообщение с просьбой ввести имя ещё раз.
import java.util.Scanner;

public class Main_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine();//Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }
}
