package homeWork;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        /*
        ������ ������ � ����������
1. ���� ������ ����� ��������� � ��������� - �������� �� ����
2. ��������� ���-�� ���� � ������
3. ������������� ������ ���, ����� ��� ������� ���� � ������ ��������
4. ������� �������� ������ ����������� �������� ����� ���-�� ���� � ������ ����� � ������
   � � ��������������� �������� ������� ��� ���-�� ����,  ��������
������
� ��� ��������� ���� � �������
�������� ������
1 3 9 4 1 7
5 ������� ����� ������� �����

         */
        //==========================================================================================================

        //1. ���� ������ ����� ��������� � ��������� - �������� �� ����


        System.out.println("������ 1. ���� ������ ����� ��������� � ��������� - �������� �� ����\n");


        String text;
        System.out.println("������� ������ �� ���� ");

       // text = "Fuissef detracto ipsum Iommodi sonet evertitur Dictum est dolorum quis. Iaculis suscipit Pericula proin dicunt petentium netus altera eripuit.";

         Scanner scanner = new Scanner(System.in);
          text = scanner.nextLine();


        String[] massText = text.toLowerCase().split(" ");
        String textOut = "";

        for (String s : massText) {
            if (s.charAt(0) == (s.charAt(s.length() - 1))) {
                textOut = textOut + " " + s + ", ";

            }
        }
        System.out.printf("             �  ����� %s ������ ����� ��������� � ���������\n\n", textOut);

        //=============================================================================


        //  2. ��������� ���-�� ���� � ������


        System.out.println("������ 2. ��������� ���-�� ���� � ������\n");

        int count = 0;
        for (String s : massText) {
            count++;
        }
        System.out.printf("             ���-�� ���� � ������ = %d \n\n", count);

        //===========================================================================================

        //   3. ������������� ������ ���, ����� ��� ������� ���� � ������ ��������


        System.out.println("������ 3. ������������� ������ ���, ����� ��� ������� ���� � ������ ��������\n \n");

        String textLowerCase = text.toLowerCase();
        System.out.printf("             ��������� �����         :   %s\n", text);
        System.out.printf("             ����� � ������ �������� :   %s \n\n", textLowerCase);


        //========================================================================================


        /*4. ������� �������� ������ ����������� �������� ����� ���-�� ���� � ������ ����� � ������
             � � ��������������� �������� ������� ��� ���-�� ����,
             ��������:
             ������ :  "� ��� ��������� ���� � �������"
             �������� ������ :  1 3 9 4 1 7

         */


        System.out.println("������ 4. ������� �������� ������ ����������� �������� ����� ���-�� ���� � ������ ����� � ������\n" +
                "             � � ��������������� �������� ������� ��� ���-�� ����,\n" +
                "             ��������:\n" +
                "             ������ :  \"� ��� ��������� ���� � �������\"\n" +
                "             �������� ������ :  1 3 9 4 1 7\n \n");

        String[] word = text.split(" ");
        int[] letters = new int[100];
        String textCount = "";


        for (String s : word) {
            int countLetters = s.length();
            for (int i = 0; i < word.length; i++) {
                letters[i] = countLetters;
            }
            textCount = textCount + " ," + countLetters;

        }

        System.out.printf("             ������ : %s \n", text);
        System.out.printf("             �������� ������ : %s\n", textCount);

    }
}
