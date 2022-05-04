package Cat;

public class Cat {
    private final String color;
    //ѕол€ класса
    double weight;
    String name;
    int age;

    public Cat(String color) {

        this.color = color;
    }

    public Cat(String color, double weight, String name, int age) {
        this.color = color;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    //ћетоды класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
    }

    // онструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        /* как видно, мы создали новые переменные и указали их тип пр€мо в скобках, описывающих, какие именно переменные будут передаватьс€ этой функции, когда мы будем еЄ использовать. ќбратите внимание, что именно значени€ этих переменных (например, name1) потом передаютс€ пол€м класса (например, name)*/
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        Cat barsik = new Cat(color); // создали кота из класса Cat.Cat
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");

    }


    public void setName(String pushok) {
    }
}
