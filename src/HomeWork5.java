import java.util.Scanner;
//��� �������� �� �� ����������

public class HomeWork5 {
    public static void main(String[] args) {
/*
������� 5 ������ ������ � ����������. � ������ ������ �����������
�����, ������� ����� ���� ���������� ��������� ���
�����������. ���������� ��������� ���������� ���� �
������, � ������� ������ ���������� ����.

 */
        System.out.println("������� ������   ");
        Scanner scanner = new Scanner(System.in);
          String text = scanner.nextLine();

        //String text = "qwe rrt ttt tttt tttt ggg gggg dsssss ";
        int count = 0;

        String[] word = text.split(" ");
        for (String s : word) {
            if ((s.length() % 2) == 0)
                count++;
        }
        System.out.println("K��������� ���� � ������, � ������� ������ ���������� ����. = " + count);
    }
}
