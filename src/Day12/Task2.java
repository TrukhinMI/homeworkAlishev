package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List <Integer> integerList = new ArrayList<>();
        System.out.println(addArray(0, 350, integerList));

    }

    private static List<Integer> addArray(int number1, int number2, List<Integer> integers){
        List <Integer> list = integers;
        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0){
                if (i > 30 && i < 300)
                    continue;
                list.add(i);
            }
        }
        return list;
    }
}
