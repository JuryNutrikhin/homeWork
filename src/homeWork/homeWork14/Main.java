package homeWork.homeWork14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * �������
 * � ��� ������� ��������� ���� text.txt. ���������� � ���� ������, ��� ����� ����������� ������ �����,
 * ����� �������� � ��������� ���� result.txt ������ ����������. �����, � ����� ����� ����� ��������
 * ����� ����� ����������� ����� � ��� �������.
 */
public class Main {
    public static void main(String[] args) {

        ParserText parserText = new ParserText("text.txt");
        parserText.parse();

        Map<String,Integer>  frequency1 = parserText.frequency();
        try(FileWriter fileWriter = new FileWriter("result.txt")){

            for(Map.Entry<String,Integer> entry : frequency1.entrySet()){
                String s = String.format("%15s ����������� %5d ��� \n",entry.getKey(),entry.getValue());
                fileWriter.write(s);
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
