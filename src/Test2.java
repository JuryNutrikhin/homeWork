//ЗАДАНИЕ ВЫПОЛНЕНО И ОТПРАВЛЕНО

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        Задание 1
            Написать программу, которая проверяет, все ли значения  элементов массива одинаковые.
            Вывести: Yes – если все  одинаковы и No – если имеется хоть одно различие.
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
        Задание 2
            Ввести с клавиатуры строку текста, а затем один символ.
            Показать на консоль индексы и количество совпадений (ищем
            вхождения символа в строку). В случае если совпадений не
            найдено, вывести соответствующий текст
         */
        System.out.println("Введите строку текста");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Введите символ");
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
            System.out.printf("Количество совпадений символа ' %c ' в тексте равно %d , индекс соавпатений " + indexText, symbol,count);
        }
        else {
            System.out.printf("Количество совпадений символа %c в тексте нет", symbol);

        }



    }
}
