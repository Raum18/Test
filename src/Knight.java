public class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

    public static void main(String[] args) {
        //Явили миру рыцаря
        Knight knight = new Knight();
        //Отправляем его за принцессой
        knight.goAndSaveThePrincess();
    }

    public void goAndSaveThePrincess() {
        sharpenBlade();
        getFood();
        assembleTeam();
        Kon();
        System.out.println("Да иду уже...-1");
    }

    private void sharpenBlade() {
        System.out.println("Точим мечь-2");
    }

    private void getFood() {
        System.out.println("Собираем консервы-3");
    }

    private void assembleTeam() {
        System.out.println("Будим оруженосца-4");
    }

    private void Kon() {
        System.out.println("Точим мечь-5");
    }
}
