package homeWork;

import java.util.Scanner;
//КОД РАБОТАЕТ НО НЕ ОТПРАВЛЕНО

public class HomeWork5 {
    public static void main(String[] args) {
/*
Задание 5 Ввести строку с клавиатуры. В строке должны содержаться
слова, которые могут быть раздельные пробелами или
двоеточиями. Необходимо вычислить количество слов в
строке, у которых четное количество букв.

 */
        System.out.println("Введите строку   ");
        Scanner scanner = new Scanner(System.in);
          String text = scanner.nextLine();

        //String text = "qwe rrt ttt tttt tttt ggg gggg dsssss ";
        int count = 0;

        String[] word = text.split(" ");
        for (String s : word) {
            if ((s.length() % 2) == 0)
                count++;
        }
        System.out.println("Kоличество слов в строке, у которых четное количество букв. = " + count);
    }
}
