package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 25, 3, 4, 5, 7, 6, 8, 8, 9, 10, 5, 4, 2);

        Consumer<Integer> printEvenNumber = numero -> System.out.println(numero);
        numeros.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(new Consumer<Integer>() {
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println("Os numeros pares disponiveis são "+n);
                }
            };
        });
    }
}
