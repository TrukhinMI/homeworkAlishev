package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Random random = new Random();

        try {
            PrintWriter pw = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++){
                pw.println((random.nextInt(100)));
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter pw2 = new PrintWriter(file2);

            int counter = 0;
            int sum = 0;
            while (scanner.hasNextInt()){
                sum += scanner.nextInt();
                counter++;
                if (counter == 20) {
                    pw2.println(sum / 20.0);
                    counter = 0;
                    sum = 0;
                }
            }
            pw2.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        printResult(file2);


    }

    public static void printResult (File file) throws FileNotFoundException {
        double d = 0;

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
            d += Double.parseDouble(scanner.nextLine());

        System.out.println((int)d);


    }
}
