package homeWork.homeWork14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Задание
 * У вас имеется текстовый файл text.txt. Посчитайте в этом тексте, как часто встречается каждое слово,
 * затем выведите в отдельный файл result.txt данную информацию. Также, в конец этого файла выведите
 * самое часто встречаемое слово и его частоту.
 */
public class Main {
    public static void main(String[] args) {

        ParserText parserText = new ParserText("text.txt");
        parserText.parse();

        Map<String,Integer>  frequency1 = parserText.frequency();
        try(FileWriter fileWriter = new FileWriter("result.txt")){

            for(Map.Entry<String,Integer> entry : frequency1.entrySet()){
                String s = String.format("%15s встречается %5d раз \n",entry.getKey(),entry.getValue());
                fileWriter.write(s);
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }


    }
}
