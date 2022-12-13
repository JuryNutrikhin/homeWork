package homeWork;

import java.util.Arrays;
//Выполнено сдано
public class HomeWork99 {
    public static void main(String[] args) {
        String text = "a as dfh ;an  sdjf  hsd";
        String text2 = "a as dfh ;an  sdjfhsd";

        text = punct(text);
        text2 = punct(text2);
        text = punctS(text);
        text2 = punctS(text2);


      String  text3 = punct(text2);

        char[] charsMas = text.toCharArray();
        char[] charsMas2 = text2.toCharArray();//делаем из слова массив символов

        Arrays.sort(charsMas);//сортировка массива
        Arrays.sort(charsMas2);

        String str =new String(charsMas); //создаем строку
        String str2  = new String(charsMas2);

        if(str.equals(str2)){
            System.out.println("Строки анаграмма");
        }
        else System.out.println("строки не анаграммы");

        System.out.println( str);
        System.out.println(str2);

    }//=============

    public static String punct(String source) {
        return source.replaceAll("\\p{Punct}", "");//удаление  знаков пунктуации

    }    public static String punctS(String source) {
        return source.replaceAll("\\s", "");//удаление   пробелов

    }


}
