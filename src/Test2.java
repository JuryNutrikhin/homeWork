//������� ��������� � ����������

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        ������� 1
            �������� ���������, ������� ���������, ��� �� ��������  ��������� ������� ����������.
            �������: Yes � ���� ���  ��������� � No � ���� ������� ���� ���� ��������.
         */

        int[] numMass1 = {1, 2, 3, 4, 5};

        int[] numMass2 = {1, 3, 3, 4, 5};
        boolean c = false;


        //========================================

        for (int i = 0; i < numMass1.length; i++) {
            c = false;
            if (numMass1[i] == numMass2[i]) {
                c = true;

            } else {
                System.out.println("NO");
                break;
            }

        }
        if (c)
            System.out.println("Yes");

        //=================================================================================
        /*
        ������� 2
            ������ � ���������� ������ ������, � ����� ���� ������.
            �������� �� ������� ������� � ���������� ���������� (����
            ��������� ������� � ������). � ������ ���� ���������� ��
            �������, ������� ��������������� �����
         */
        System.out.println("������� ������ ������");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("������� ������");
        char symbol = scanner.next().charAt(0);
        int count = 0;
        String indexText = " ";


        for (int i = 0; i < text.length() ; i++) {
            if (text.charAt(i) == symbol) {
                indexText += "[" + i + "] ";
                count++;
            }

        }
        if (count != 0) {
            System.out.printf("���������� ���������� ������� ' %c ' � ������ ����� %d , ������ ����������� " + indexText, symbol,count);
        }
        else {
            System.out.printf("���������� ���������� ������� %c � ������ ���", symbol);

        }



    }
}
