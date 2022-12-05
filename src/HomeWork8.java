public class HomeWork8 {     //Выполнено сдано

    /*
    В языке Java принято первое слово, входящее в название
переменной, записывать с маленькой латинской буквы.
Следующее слово идет с большой буквы (только первая
буква слова – большая). Слова не имеют разделителей и
состоят только из латинских букв. Например, правильные
записи переменных в Java могут выглядеть следующим
образом: javaIdentiqer, longAndMnemonicIdentiqer,
name, nEERC.
В языке C++ для описания переменных используются
только маленькие латинские символы и символ «_»,
который отделяет непустые слова друг от друга. Если
строка имеет смешанный синтаксис: например java_
Identiaer, сообщить об этом. Примеры: java_identiaer,
long_and_mnemonic_identiaer, name, n_e_e_r_c.
Вам требуется написать программу, которая преобразует
переменную, записанную на одном языке, в формат другого
языка. Идентификатор (имя) переменной должен вводится с
клавиатуры. Программа должна определить, из какого языка
взята переменная, и переделать ее в переменную другого
языка. Вывести результат на консоль.

     */

    public static void main(String[] args) {

         //String text2 = "CeteroEpicureiGraecoReformidansTinciduntAppareatMutatConsecteturMoluptatumPosteaMuciusTacitiViris";
         String text2 = "Mediocritatem_risus_patrioque_commodo_omnesque_Tellus_eloquentiam_sollicitudin_dolores_iusto_ponderum_eros_magnis";
        String text1Out = "";
        String letter = "";
        String text2Out = "";
        String text3Out = "";


        // определть какой язык Java или С++.
        String[] wordC = text2.split("_");

        int index = text2.indexOf('_');
        if (index > 0) {

            //  text1Out = text1Out+ text1.substring(0,1).toUpperCase();
            for (String s : wordC) {
                text1Out = text1Out + s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
            }
        } else if (index < 0) {
            for (int i = 0; i < text2.length(); i++) {

                if ((text2.substring(i, i + 1)).equals(text2.substring(i, i + 1).toUpperCase()))
                    text2Out = text2Out + "_" + text2.substring(i, i + 1).toLowerCase();

                else text2Out = text2Out + text2.substring(i, i + 1);
            }
        }
        if (index < 0) {
            letter = text2.substring(0, 1);
            text3Out = letter + text2Out.substring(2, text2Out.length());
        }


        System.out.println(text2);
        System.out.println();
        System.out.print(text2Out);
        System.out.println();
        System.out.println(text3Out);
        System.out.println(text1Out);
    }
}
