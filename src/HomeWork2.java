import java.util.Scanner;
//КОД РАБОТАЕТ НО НЕ ОТПРАВЛЕНО
public class HomeWork2 {
    public static void main(String[] args) {
        //===================================================================

        //Задание 2

        // Написать программу, которая создаст строку, в которой
        //находятся все целые числа, начиная с 1, выписаны в одну
        //строку «123456789101112131415...». Строка должна быть
        //длиной не более 1 000 символов.
        //По числу n (введенного с клавиатуры), выведите цифру на
        //n-й позиции (используется нумерация с 1

        //===================================================================

        //создаем строку
        String str=""  ;

        int positionNumber;
         int n = 0;

            for (int i = 0; n < 1000; i++) {
                str += i;
                n = str.length();

            }
            System.out.println(str);
            System.out.println("Введите цифру позиции");
            Scanner scanner = new Scanner(System.in);
            positionNumber = scanner.nextInt();

        System.out.println((str.charAt(positionNumber)));//str.charAt(positionNumber) -char charAt(int index) возвращает значение char по указанному индексу.



    }
}
