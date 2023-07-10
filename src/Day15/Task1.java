package Day15;

import java.io.File;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "shoes.csx";
        File file = new File(path);

        List<Shoes> shoes = ReadFile.readFile(file);

        WriteFile.writeFile(shoes);


    }


}
