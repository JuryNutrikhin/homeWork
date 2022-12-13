package homeWork;

import java.util.Arrays;

//Выполнено сдано

import java.util.Locale;

public class HomeWork9 {
    public static void main(String[] args) {
        /*
        Задание 9
Написать программу, проверяющую является ли одна
строка анаграммой для другой строки (строка может состоять
из нескольких слов и символов пунктуации). Пробелы и
пунктуация должны игнорироваться при анализе. Разница
в больших и маленьких буквах должна игнорироваться. Обе
строки должны вводиться с клавиатуры. Программа должна
выводить Yes, если строки являются анаграммой, и No –
иначе.
Пример анаграммы в стихах:
Строка 1 «Аз есмь строка, живу я, мерой остр».
Строка 2 «За семь морей ростка я вижу рост!»

         */

        String text = "Аз ";
        String text2 = "Аз "; //"За семь морей ростка я вижу рост!";
//
//        text = repl(text);
//        text2 = repl(text);
//
//        String[] word = text.toLowerCase().split(" ");
//        String[] word2 = text2.toLowerCase().split(" ");
//
//        boolean anagramTrue = true;
//        exits:
//        if (text.length() == text2.length()) {
//            if (anagramTrue) {
//                anagramTrue = false;
//                for (String s : word) {
//                    for (String s2 : word2) {
//                        if (s.length() == s2.length()) {
//                            char[] chars = s.toCharArray();
//                            Arrays.sort(chars);
//                            char[] chars2 = s2.toCharArray();
//                            Arrays.sort(chars2);
//
//                            if (chars == chars2)
//                                anagramTrue = true;
//
//                        } else
//                            System.out.println("не анаграмма");
//                        break exits;
//                    }
//
//
//                }
//                System.out.println("Анаграммa");
//            }
//        }
//
    }
//
//    public static String repl(String source) {
//        return source.replaceAll("\\p{Punct}", "");//удаление  знаков пунктуации
//    }

}
