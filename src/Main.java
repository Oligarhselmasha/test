import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Main {

    public HashMap<String, Integer> one = new HashMap<>();
    public HashMap<String, Integer> two = new HashMap<>();

    public static void main(String[] args) {
         print();

    }
    public static void print () {
        String content = readFileContentsOrNull("resources/test.csv");
        String[] lines = content.split(System.lineSeparator());
        for (int i = 0; i < lines.length; i++){
            String[] linesContent = lines[i].split(",");
            for (int j =0; j < linesContent.length; j++) {
                if (linesContent[2].equals("true")){
                    one.put("Первый", linesContent[1]);
                } else if (linesContent[2].equals("false")){
                    two.put("Первый", linesContent[1]);
                }

                System.out.println(linesContent[j]);
            }
            }


            }




    private static  String readFileContentsOrNull(String path)    {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }
}
