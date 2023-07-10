package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class WriteFile {
    public static void writeFile(List<Shoes> shoesList){
        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt";
        File file = new File(path);
        file.getParentFile().mkdirs();

        try {
            PrintWriter pw = new PrintWriter(file);

            for (Shoes shoes : shoesList){
                if (shoes.getNumber() == 0){
                    pw.append(shoes.getName() + ", " + shoes.getSize() + ", " + shoes.getNumber());
                    pw.append('\n');

                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
