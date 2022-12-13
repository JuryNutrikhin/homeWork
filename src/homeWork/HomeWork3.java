package homeWork;

import java.util.Scanner;
//КОД РАБОТАЕТ НО НЕ ОТПРАВЛЕНО
public class HomeWork3 {
    public static void main(String[] args) {
//        Задание 3
//        Подсчитать среднюю длину слова, во введенном с
//        клавиатуры предложении.

        //======================================================

        System.out.println("Введите текст");
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
        System.out.printf("Среднее число букв в слове текста =  %d ",average);



    }
}
