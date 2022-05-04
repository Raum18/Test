package ArraysAndStrings;
//Напишите программу, в которой пользователя просят ввести имя и пароль. Пароль должен быть ограничен по размеру от 8 до 15 символов. В случае ввода неверного пароля программа должна запрашивать пароль снова и выводить на экран причину ошибки.
//В случае, если пароль введен верно, программа должна выводить имя пользователя и его пароль. Удачи, и да прибудет с вами сила!
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = sc.nextLine();
        System.out.println("Создайте пароль:");
        String PW = sc.nextLine();
        if (PW.length() < 8 || PW.length() > 15) {
            do {
                System.out.println("Длина пароля должна составлять от 8 до 15 символов");
                PW = sc.nextLine();
            } while (PW.length() < 8 || PW.length() > 15);
        }
        System.out.printf("%s, Ваш новый пароль: %s", name, PW);
    }
}
