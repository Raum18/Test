public class grade {
    public static void main(String[] args) {

        int grade = 3;

        switch (grade) {
            case 5:
                System.out.println("Otlichno!");
                break;
            case 4:
                System.out.println("Khorosho!");
                break;
            case 3:
            case 2:
                System.out.println("Mozhno luchshe!");
                break;
            case 1:
                System.out.println("Pridetsya peredelat'.");
                break;
            default:
                System.out.println("Nevernaya otsenka");
        }
    }
}
