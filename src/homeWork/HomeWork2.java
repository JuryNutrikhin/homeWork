package homeWork;

import java.util.Scanner;
//��� �������� �� �� ����������
public class HomeWork2 {
    public static void main(String[] args) {
        //===================================================================

        //������� 2

        // �������� ���������, ������� ������� ������, � �������
        //��������� ��� ����� �����, ������� � 1, �������� � ����
        //������ �123456789101112131415...�. ������ ������ ����
        //������ �� ����� 1 000 ��������.
        //�� ����� n (���������� � ����������), �������� ����� ��
        //n-� ������� (������������ ��������� � 1

        //===================================================================

        //������� ������
        String str=""  ;

        int positionNumber;
         int n = 0;

            for (int i = 0; n < 1000; i++) {
                str += i;
                n = str.length();

            }
            System.out.println(str);
            System.out.println("������� ����� �������");
            Scanner scanner = new Scanner(System.in);
            positionNumber = scanner.nextInt();

        System.out.println((str.charAt(positionNumber)));//str.charAt(positionNumber) -char charAt(int index) ���������� �������� char �� ���������� �������.



    }
}
