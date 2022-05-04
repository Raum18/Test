//Базовый вариант программы «Угадай число»

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(10) + 1;

        Scanner console = new Scanner(System.in);
//Vvedite chiclo
        while (true) {
            System.out.print("Введите число: ");
            //сохраняем введённое пользователем число в переменной userInput
            int userInput = console.nextInt();

            //проверяем условие и выводим сообщения
            if (userInput == randInt) {
                System.out.println("Sovershenno verno!");
                break;
            } else if (userInput > randInt) {
                System.out.println("Chislo menshe");
            } else {
                System.out.println("Chislo bolshe");
            }
        }
    }
}
