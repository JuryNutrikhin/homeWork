import java.util.Scanner;
//КОД РАБОТАЕТ НО НЕ ОТПРАВЛЕНО
public class HomeWork4 {
    public static void main(String[] args) {
        /*
        Задание 4
Ввести строку с клавиатуры (латиницей). Из введенной
строки выбрать все слова, начинающиеся на гласные буквы
и заканчивающиеся на согласные. Вывести отобранные
слова на консоль

         */

        System.out.println("Введите строку   ");
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

        System.out.println("слова которые начинающиеся на гласные буквы и заканчивающиеся на согласные\n"+textOut );

    }
}
