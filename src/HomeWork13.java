import java.util.Date;
import java.util.Locale;

public class HomeWork13 {
    public static void main(String[] args) {
        //Задача 3. Найти количество всех двухзначных чисел, у которых сумма цифр кратная 2

        int[][] matrix2 = {
                {11, 223, 43, 34, 55},
                {12, 22, 332, 44, 55},
                {11, 22, 331, 44, 553},
                {111, 22, 33, 44, 553},
                {11, 22, 331, 44, 55},};
        int n = 5;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = matrix2[i][j] / 100;
                if (num == 0) {
                    int num2 = matrix2[i][j] % 10;
                    num2 += matrix2[i][j] / 10;
                    if (num2%2==0)
                        count++;

                }
            }
        }
        System.out.printf("количество всех двухзначных чисел, у которых сумма цифр кратная 2 = %d \n",count);
        Date date = new Date();
        System.out.printf("%tB %te, %tY",date,date,date);

        System.out.println("\nЛокализация");
        System.out.printf(Locale.ENGLISH, "%,d%n", 1000000);// 1,000,000
        System.out.printf(Locale.GERMAN, "%,d%n", 1000000); // 1.000.000
        System.out.printf(Locale.FRANCE, "%,d%n", 1000000); // 1

        String s = String.format("Курс валют: %-4s%-8.4f  %-4s%-8.4f", "USD", 58.4643, "EUR", 63.3695);
        System.out.println(s);
    }
}
