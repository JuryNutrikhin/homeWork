package homeWork;

public class HomeWork11 {
    public static void main(String[] args) {
        //������ 1. ������� ��� � ������� ����������� �������� �����

        int n = 5;
        int count=0;
        int num = 3;

     //   int [][] matrix = new int[n][n];
       int [][] matrix = {{1,2,3,4,5},
                          {2,4,3,7,4},
                          {2,3,4,7,8},
                          {2,3,4,7,5},
                          {2,4,5,6,7}};
       for(int i =0;i<n;i++){
           for (int j = 0 ;j<n;j++){
               if(matrix[i][j]==num){
                   count++;
               }
           }
       }
        System.out.printf("������ 1. ������� ��� � ������� ����������� �������� �����" +
                "�����  %d ����������� � ������� %d ���\n",n,count);
        System.out.println();




       //=====================================================================
        // ������ 2. ��������� ������� � �������� ���������� �������
        int n2 = 5;
        int[][] temp = new int[n2][n2];

        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}};
        System.out.println("������ 2. ��������� ������� � �������� ���������� ������� ������� ����������� ");

        for (int i = 0; i < n2; i++) {
            System.out.println();
            for (int j = 0; j < n2; j++)
                System.out.print( matrix1[i][j] + " ");
        }
        System.out.println();
        System.out.println();



        for (int i = 0; i < n2 ; i++) {
            // for(int j=0;j<n2;j++){

            temp[i][i] = matrix1[i][i];
            matrix1[i][i] = matrix1[i][n2 -i- 1];
            matrix1[i][n2 -i- 1] = temp[i][i];
        }
        System.out.println(
                " ������� ����� ���������� ������� � �������� ���������� " );
        for (int i = 0; i < n2; i++) {
            System.out.println();
            for (int j = 0; j < n2; j++)
                System.out.print( matrix1[i][j] + " ");

        }
        System.out.println();




       //=====================================================================
        //������ 3. ����� ���������� ���� ����������� �����, � ������� ����� ���� ������� 2

        int[][] matrix2 = {
                {11, 223, 43, 34, 55},
                {12, 22, 332, 44, 55},
                {11, 22, 331, 44, 553},
                {111, 22, 33, 44, 553},
                {11, 22, 331, 44, 55},};
        int n3 = 5;
        int count3 = 0;
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j < n3; j++) {
                int num3 = matrix2[i][j] / 100;
                if (num3 == 0) {
                    int num2 = matrix2[i][j] % 10;
                    num2 += matrix2[i][j] / 10;
                    if (num2%2==0)
                        count3++;

                }
            }
        }
        System.out.println();
        System.out.println("������ 3. ����� ���������� ���� ����������� �����, � ������� ����� ���� ������� 2");
        System.out.printf("���������� ���� ����������� �����, � ������� ����� ���� ������� 2 = %d ",count3);
    }
}
