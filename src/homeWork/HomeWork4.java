package homeWork;

import java.util.Scanner;
//��� �������� �� �� ����������
public class HomeWork4 {
    public static void main(String[] args) {
        /*
        ������� 4
������ ������ � ���������� (���������). �� ���������
������ ������� ��� �����, ������������ �� ������� �����
� ��������������� �� ���������. ������� ����������
����� �� �������

         */

        System.out.println("������� ������   ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

      //  String text ="wer ert uyu ttt plj ikl bne";

        char[] vowelsLetters = {'e', 'y', 'u', 'i', 'o', 'a', 'j',};
        char[] consonantsLetters ={'q','w','r','t','p','s','d','f','g','h','k','l','z','x','v','b','n','m'};
        String [] word = text.split(" ");
        int count = 0;
        String textOut = "";

        for (String s:word ) {
          char begin = s.charAt(0);
          char end = s.charAt((s.length())-1);
          for (char c : vowelsLetters){
              if (begin==c){
                  for(char c1 :consonantsLetters){
                      if(end==c1){
                          textOut+=s+" ";
                      }
                  }

              }
          }
        }

        System.out.println("����� ������� ������������ �� ������� ����� � ��������������� �� ���������\n"+textOut );

    }
}
