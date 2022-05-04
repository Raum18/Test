public class Main_9 {
    // Реализуйте метод, который будет удалять из строки все пробелы
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
        return str.replaceAll(" ", "");
    }
}
