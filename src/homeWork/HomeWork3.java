package homeWork;

import java.util.Scanner;
//��� �������� �� �� ����������
public class HomeWork3 {
    public static void main(String[] args) {
//        ������� 3
//        ���������� ������� ����� �����, �� ��������� �
//        ���������� �����������.

        //======================================================

        System.out.println("������� �����");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        //String text = "Accg ff meffflirrrrrrrrrrr ";

        String [] word = text.split(" ");
        int countingLetters = 0;
        int average ;
        int n = word.length;

        for (String s :word) {
            countingLetters +=s.length();
        }
        average= countingLetters/n;
        System.out.printf("������� ����� ���� � ����� ������ =  %d ",average);



    }
}
