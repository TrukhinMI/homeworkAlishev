package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> brand = new ArrayList<>(Arrays.asList("Lada", "Ford", "Москвич", "BMW", "ГАЗ"));
        System.out.println(brand);
        brand.remove(0);
        System.out.println(brand);
        brand.add(brand.size()/2, "AUDI");
        System.out.println(brand);

    }
}
