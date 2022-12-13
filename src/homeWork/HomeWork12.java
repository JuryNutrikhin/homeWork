package homeWork;

public class HomeWork12 {  //РАБОТАЕТ НЕ СДАНО
    public static void main(String[] args) {

        // Задача 2. Переворот главной и побочной диагоналей матрицы
        int n = 5;
        int[][] temp = new int[n][n];

        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};
        for (int i = 0; i < n ; i++) {
            // for(int j=0;j<n;j++){

            temp[i][i] = matrix1[i][i];
            matrix1[i][i] = matrix1[i][n -i- 1];
            matrix1[i][n -i- 1] = temp[i][i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print(matrix1[i][j] + " ");
        }

    }
}
