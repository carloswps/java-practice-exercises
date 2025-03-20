package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumbersRemovingOdd {
    public static void main(String[] args) {
        List<Integer> numeros =  new ArrayList<>(Arrays.asList(1, 25, 3, 4, 5, 7, 6, 8, 8, 9, 10, 5, 4, 2));

        Predicate<Integer> oddNumber;

        numeros
        .removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 != 0;
            }
        });

        numeros.stream().sorted();
        System.out.println(numeros);
        ;
    } 
}
