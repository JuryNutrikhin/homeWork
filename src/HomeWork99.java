import java.util.Arrays;
//��������� �����
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
        char[] charsMas2 = text2.toCharArray();//������ �� ����� ������ ��������

        Arrays.sort(charsMas);//���������� �������
        Arrays.sort(charsMas2);

        String str =new String(charsMas); //������� ������
        String str2  = new String(charsMas2);

        if(str.equals(str2)){
            System.out.println("������ ���������");
        }
        else System.out.println("������ �� ���������");

        System.out.println( str);
        System.out.println(str2);

    }//=============

    public static String punct(String source) {
        return source.replaceAll("\\p{Punct}", "");//��������  ������ ����������

    }    public static String punctS(String source) {
        return source.replaceAll("\\s", "");//��������   ��������

    }


}
