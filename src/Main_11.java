//—делайте так, чтобы им€ пользовател€ форматировалось по следующим правилам:
//—амое короткое слово в имени должно быть на первом месте, а самое длинное Ч на последнем, то есть отсортируйте слова в имени по длине.
//—делайте так, чтобы каждое слово в имени было написано с большой буквы.

import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //—читывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("¬ведите корректное им€!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");
        sortByLength(words);
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + "";
            }
        }
        return result;
    }

    private static void sortByLength(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }
            }
        }
    }
}
