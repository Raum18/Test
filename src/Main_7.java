public class Main_7 {
    public static void main(String[] args) {
        String b = "Sometimes";
        System.out.println(b.charAt(5));
        //
        String a = "���� ������";
        String d = "���� ������";

        System.out.print(a.equals(d));
        //����� �� ������������ ������� ���� ��� "���� ������", ���� ��� ���� ������ ������������ � ������ "���� ������", ������, ��� ������� ����� ��� ����� �������?
        String q = "���� ������";
        String w = "���� ������";

        System.out.print(q.equalsIgnoreCase(w));
        //����� �� ������������ ������� ���� ��� "���� ������", ���� ��� ���� ������ ������������ � ������ "���� ������", ������, ��� ������� �� ����� ��� ����� �������?
    }
}
