package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<String> arraysPeople = new ArrayList<>();
        File file = new File("people.txt");
        arraysPeople= parseFileToStringList(file);
        for (String s: arraysPeople) {
            System.out.println(s);
        }


    }

    public static List<String> parseFileToStringList(File file){
        List<String> arrayList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                int i = Integer.parseInt(str.replaceAll("[^\\\\.\\-0123456789]", ""));
                if (i < 0){
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        arrayList.clear();
                        return arrayList;
                    }
                }
                arrayList.add(str);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return arrayList;
    }
}
