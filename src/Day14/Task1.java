package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("day14Task1txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            String[] numbersString = scanner.nextLine().split(" ");
            if (numbersString.length != 10){
                try {
                    throw new IOException();
                } catch (IOException e){
                    System.out.println("Некорректный входной файл");
                }
            }

            for (String number : numbersString){
                sum += Integer.parseInt(number);
            }

            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }







    }
}
