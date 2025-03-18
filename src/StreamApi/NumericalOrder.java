package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NumericalOrder {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 25, 3, 4, 5, 7, 6, 8, 8, 9, 10, 5, 4, 2);

        Consumer<Integer> orderNumerical = numero -> System.out.println(numero);

        numeros.stream()
                .sorted()
                .forEach(new Consumer<Integer>() {
                    public void accept(Integer n) {
                        System.out.println(n);
                    };
                });
    }
}
