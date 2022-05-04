package Cat;

public class Cat {
    private final String color;
    //���� ������
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

    //������ ������
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
    }

    //�����������, ����������� ���������
    public Cat(double weight, String name, int age, String color) {
        /* ��� �����, �� ������� ����� ���������� � ������� �� ��� ����� � �������, �����������, ����� ������ ���������� ����� ������������ ���� �������, ����� �� ����� � ������������. �������� ��������, ��� ������ �������� ���� ���������� (��������, name1) ����� ���������� ����� ������ (��������, name)*/
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        Cat barsik = new Cat(color); // ������� ���� �� ������ Cat.Cat
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
        Cat smallCat = new Cat(1000, "Kuzya", 1, "White");

    }


    public void setName(String pushok) {
    }
}
