//������� ��������� � ����������

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
     ������1   ������� �����, ������� ����������� ����� ����� ����� ����� �������.
         */
        System.out.println("�������  2 �����");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();


        System.out.println("����� �����  ����� ������� " + number1 + " � " + number2 + " ����� "+ sumNum(number1, number2));
//===================================================
        //������2
        /*
        ������� ����� ��� ���������� ����� ��� ������������ ���� �����.
         */
        int sumNumber = sum(number1,number2);

        System.out.printf("�����  ����� %d � %d ����� %d\n" ,number1,number2,sumNumber) ;
        System.out.printf("������������  ����� %d � %d ����� %d" ,number1,number2,  multipl(number2,number1)) ;


    }
    //=======================================================
         /*
     ������1   ������� �����, ������� ����������� ����� ����� ����� ����� �������.
         */

     static int sumNum(int num1, int num2) {
        int a = num1;
        int b = num2;
        int sum = 0;
        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
    //===================================================
    /*
    ������ 2
    ������� ����� ��� ���������� ����� ��� ������������ ���� �����.
     */
    static int  sum( int a, int b){
        int num1 = a;
        int num2 = b;
        int sum = 0;

        sum = num1+num2;
        return sum;
    }

    static  int multipl(int a ,int b){
        int num1 = a;
        int num2 = b;
        return num1*num2;
    }
    //=======================================================

}
