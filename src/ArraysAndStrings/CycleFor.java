package ArraysAndStrings;
//�������� ������ � ��������������� ��� ���������� ����������: 5, 24, 3, 66, 38, 16, 27. ��������� ���������� ������� � �������� ������ ������� �������.
import java.util.Arrays;

public class CycleFor {

    public static void main(String[] args) {
        int[] array = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(array);
        System.out.println(array[3]);
    }
}