public class Example {
    public static void main(String[] args) {
        int[] array = new int[11]; // ������ array �������� ���� ����
        int value = 5; // ������ �������� ��� ������� array
        for (int i = 0; i < array.length; i++) { // ������� ���� ������, ������� � 0-�� �������
            array[i] = value; // ����������� ������ �������� value
            value++; // ����������� value �� 1 ������ ��� (5, 6, 7, ..., 15)
        }
        for (int item : array) { // ����������� (int i = 0; i < array.length; i++)
            System.out.println(item); //�������� ������� �������
        }
    }
}
