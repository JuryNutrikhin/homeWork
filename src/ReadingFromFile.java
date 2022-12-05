import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String paht = "C:"+separator+"Users"+separator+"ÍÞÒ"+separator+"Desktop"+separator+"Java.txt";
        File file = new File(paht);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
