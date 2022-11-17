package functionalInterfaces;

import java.util.Random;
import java.util.function.*;

public class FInterfaces {
    public static void main(String[] args) {
        // Лямбда-выражение для увеличения числа в два раза
        Consumer<Integer> consumerTest = v -> System.out.println(v + " * 2 = " + v * 2);
        consumerTest.accept(12);

        // Лямбда-выражение для возведение числа в квадрат
        Function<Integer, String> functionTest = v -> String.valueOf(v * v);
        System.out.println("12 ^ 2 = " + functionTest.apply(12));

        // Лямбда-выражение для проверки числа на четность
        Predicate<Integer> predicateTest = v -> v % 2 == 0;
        System.out.println("12 это четное число: " + ((predicateTest.test(12)) ? "Да" : "Нет"));
        System.out.println("13 это четное число: " + ((predicateTest.test(13)) ? "Да" : "Нет"));

        // Лямбда-выражение для получения произвольного числа
        Supplier<Integer> supplierTest = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println("Получение произвольного числа: " + supplierTest.get());

        // Лямбда-выражение для пользовательской унарной операции
        UnaryOperator<Integer> unaryOperatorTest = v -> v * 2 - 1;
        System.out.println("12 * 2 - 1 = " + unaryOperatorTest.apply(12));

        // Лямбда-выражение для пользовательской бинарной операции (возведения в степень)
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            int c = 1;
            for (int i = 0; i < b; i++) {
                c *= a;
            }
            return c;
        };
        System.out.println("2 ^ 4 = " + binaryOperator.apply(2, 4));
    }
}

