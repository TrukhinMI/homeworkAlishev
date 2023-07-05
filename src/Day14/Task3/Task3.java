package Day14.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        List<Person> people;
        people = parseFileToObjList(file);
        for (Person p : people)
            System.out.println(p.getName() + " : " + p.getAge());

    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> personList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String[] person = scanner.nextLine().split(" ");
                int age = Integer.parseInt(person[1]);
                if (age < 0)
                    throw new IOException();
                personList.add(new Person(person[0], age));

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }


        return personList;
    }
}
