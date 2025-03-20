package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class BiggestNumber {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 25, 3, 4, 5, 7, 6, 8, 8, 9, 10, 5, 4, 2);

        Optional<Integer> bigger = numeros.stream()
                .reduce(new BinaryOperator<Integer>() {
                    public Integer apply(Integer n1, Integer n2) {
                        if (n1 > n2) {
                            return n1;
                        } else {
                            return n2;
                        }
                    };
                });

        Optional<Integer> segundoMaior = numeros.stream()
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer n) {
                        if (n < bigger.orElse(Integer.MIN_VALUE)) {
                            return true;
                        }else{
                            return false;
                        }
                    }
                })
                .reduce(new BinaryOperator<Integer>() {
                    public Integer apply(Integer n1, Integer n2) {
                        if (n1 > n2) {
                            return n1;
                        } else {
                            return n2;
                        }
                    }
                });

        System.out.println("Maior número: " + bigger.orElse(null));
        System.out.println("Segundo maior número: " + segundoMaior.orElse(null));

    }
}
