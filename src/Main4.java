public class Main4 {
    public static void main(String[] args) {
        //Izmenite znachenie a
        int a = 8;

        if (a > 9) {
            System.out.println("a bolshe 9");
        } else if (a == 9) {
            System.out.println("a ravno 9");
        } else if (a <= 9 && a > 0) {
            System.out.println("a men'she 9");
        } else {
            System.out.println("Usloviye ne vypolnyayetsya");
        }
    }
}
