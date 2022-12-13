package homeWork;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        /*
        Ввести строку с клавиатуры
1. Если первая буква совпадает с последней - сообщить об этом
2. Посчитать кол-во слов в строке
3. Преобразовать строку так, чтобы все символы были в нижнем регистре
4. Создать числовой массив размерность которого равна кол-ву букв в каждом слове в строке
   и в соответствующие элементы занести это кол-во букв,  например
Строка
У нас следующий урок в пятницу
Числовой массив
1 3 9 4 1 7
5 Вывести самое длинное слово

         */
        //==========================================================================================================

        //1. Если первая буква совпадает с последней - сообщить об этом


        System.out.println("Задача 1. Если первая буква совпадает с последней - сообщить об этом\n");


        String text;
        System.out.println("Веедите строку из слов ");

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
        System.out.printf("             В  слове %s первая буква совпадает с последней\n\n", textOut);

        //=============================================================================


        //  2. Посчитать кол-во слов в строке


        System.out.println("Задача 2. Посчитать кол-во слов в строке\n");

        int count = 0;
        for (String s : massText) {
            count++;
        }
        System.out.printf("             Кол-во слов в строке = %d \n\n", count);

        //===========================================================================================

        //   3. Преобразовать строку так, чтобы все символы были в нижнем регистре


        System.out.println("Задача 3. Преобразовать строку так, чтобы все символы были в нижнем регистре\n \n");

        String textLowerCase = text.toLowerCase();
        System.out.printf("             Введенный текст         :   %s\n", text);
        System.out.printf("             Текст в нижнем регистре :   %s \n\n", textLowerCase);


        //========================================================================================


        /*4. Создать числовой массив размерность которого равна кол-ву букв в каждом слове в строке
             и в соответствующие элементы занести это кол-во букв,
             НАПРИМЕР:
             Строка :  "У нас следующий урок в пятницу"
             Числовой массив :  1 3 9 4 1 7

         */


        System.out.println("Задача 4. Создать числовой массив размерность которого равна кол-ву букв в каждом слове в строке\n" +
                "             и в соответствующие элементы занести это кол-во букв,\n" +
                "             НАПРИМЕР:\n" +
                "             Строка :  \"У нас следующий урок в пятницу\"\n" +
                "             Числовой массив :  1 3 9 4 1 7\n \n");

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

        System.out.printf("             Строка : %s \n", text);
        System.out.printf("             Числовой массив : %s\n", textCount);

    }
}
