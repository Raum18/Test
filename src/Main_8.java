public class Main_8 {
    public static void main(String[] args) {
        String user1 = "Иван Иванов";
        String user2 = "Петр иванов";
        checkUserName(user1, user2);
    }

    private static void checkUserName(String user1, String user2) {
        String user2copy = user2.replace(" ","");
        if(user1.equalsIgnoreCase(user2)==true)
            System.out.println("Выберите другое имя пользователя");
        else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + user2.length() + " символов");
            System.out.println("А без пробелов ваше имя имеет занимает " + user2copy.length() + " символов");
        }
    }
}