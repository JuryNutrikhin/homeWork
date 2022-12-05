//ЗАДАНИЕ ВЫПОЛНЕНО И ОТПРАВЛЕНО

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
     Задача1   Создать метод, который расчитывает сумму чисел между двумя числами.
         */
        System.out.println("Введите  2 числа");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();


        System.out.println("Сумма чисел  между числами " + number1 + " и " + number2 + " ровно "+ sumNum(number1, number2));
//===================================================
        //Задача2
        /*
        Создать метод для вычислений суммы или произведения двух чисел.
         */
        int sumNumber = sum(number1,number2);

        System.out.printf("Сумма  чисел %d и %d ровно %d\n" ,number1,number2,sumNumber) ;
        System.out.printf("Произведение  чисел %d и %d ровно %d" ,number1,number2,  multipl(number2,number1)) ;


    }
    //=======================================================
         /*
     Задача1   Создать метод, который расчитывает сумму чисел между двумя числами.
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
    Задача 2
    Создать метод для вычислений суммы или произведения двух чисел.
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
