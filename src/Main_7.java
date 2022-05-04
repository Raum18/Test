public class Main_7 {
    public static void main(String[] args) {
        String b = "Sometimes";
        System.out.println(b.charAt(5));
        //
        String a = "Иван Иванов";
        String d = "иван иванов";

        System.out.print(a.equals(d));
        //Можно ли пользователю выбрать себе имя "Иван Иванов", если уже есть другой пользователь с именем "иван иванов", считая, что регистр важен для вашей системы?
        String q = "Иван Иванов";
        String w = "иван иванов";

        System.out.print(q.equalsIgnoreCase(w));
        //Можно ли пользователю выбрать себе имя "Иван Иванов", если уже есть другой пользователь с именем "иван иванов", считая, что регистр НЕ важен для вашей системы?
    }
}
