package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static List<Shoes> readFile(File file){
        List<Shoes> shoesList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            if (file.length() == 0)
                throw new EmptyFileException("");
            while (scanner.hasNextLine()){
                String[] shoes = scanner.nextLine().split(";");
                if(shoes.length == 3)
                    shoesList.add(new Shoes(shoes[0], Integer.parseInt(shoes[1]), Integer.parseInt(shoes[2])));
                else
                    throw new ArrayIndexOutOfBoundsException();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Не верный размер массива");
        } catch (EmptyFileException e){
            System.out.println("ФАйл пустой");
        }

        return shoesList;
    }


}
