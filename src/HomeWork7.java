import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        /*
        ������� 7
������������ ������ � ���������� ����� ������.
�������� � �������� ������ ��� ������� ����� ��
���������, � ��������� � �� �������. ���� � ������ ������������
�����, �������� �� ������ ������������� �
������� ��������� �� �������.

         */

        /*    int [] mas=new int[]{1,2,2,3,3};    //int => String
        String  c = Arrays.toString(mas);
        System.out.println(c);
        //===========================
        int index = Arrays.binarySearch(mas,3);//���� ������ �� �������  ������� ���� � ������� ����  ������ ����������
        System.out.println(index);

        */


        //========================================================================================


        String text = " Interdum interdum mandamus Morbi principes  5664 4566 4evertitur Postulant.456 4 Proin inve5w6w56 nire platonem Fuisset ei posidonium sed te euismod libris.ing ";
//    //    Scanner scanner = new Scanner(System.in);
//        // String text =scanner.nextLine();

        /*
          public static void main(String args[]) {
      StringBuffer sb = new StringBuffer("��������");
      sb.replace(3, 6, "ProgLang");
      System.out.println(sb);

      str.setCharAt(2, 'L');
         */
//
//
//================================================================================
        char[] myCharArrey = text.toCharArray();
        for (int i=0 ;i< myCharArrey.length;i++) {
            if (Character.isUpperCase(myCharArrey[i])) {
                myCharArrey[i] = Character.toLowerCase(myCharArrey[i]);
            }
            else myCharArrey[i] = Character.toUpperCase(myCharArrey[i]);
            if( Character.isDigit(myCharArrey[i])){
                myCharArrey[i]  = '_';
            }
        }
        String newString = String.valueOf(myCharArrey);
        System.out.println("������ ������ : " +text);
        System.out.println("����� ������  : " + newString);

//========================================================================
    }
}
