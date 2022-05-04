import java.util.Random;

public class Proba_ {
    public static void main(String[] args) {
        while (true) {
            int randomNumber = new Random().nextInt();
            if (randomNumber == 5) {
                break;
            }
            System.out.printf("Рандомное число не равно 5");
        }
    }
}
