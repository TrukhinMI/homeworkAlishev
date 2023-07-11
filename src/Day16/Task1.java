package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        result(file);
    }
    public static void result(File file){
        try {
            Scanner scanner = new Scanner(file);
            String[] arrayString = scanner.nextLine().split(" ");

            double sum = 0;
            for (String s : arrayString){
                sum += Double.parseDouble(s);
            }
            DecimalFormat df = new DecimalFormat("###.###");
            System.out.println(sum / arrayString.length + " --> " + df.format(sum / arrayString.length));


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
