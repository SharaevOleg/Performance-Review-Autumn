package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FindAnyFindFirst {

    public class Java8FindAnyFindFirstUnitTest {

        public static void main(String[] args) throws Exception {
            createStream_whenFindAnyResultIsPresent_thenCorrect();
            createParallelStream_whenFindAnyResultIsPresent_thenCorrect();
            createStream_whenFindFirstResultIsPresent_thenCorrect();
        }

        public static void createStream_whenFindAnyResultIsPresent_thenCorrect() {

            List<String> list = Arrays.asList("A", "B", "C", "D");

            Optional<String> result = list.stream().findAny();

            System.out.println(result.isPresent());
        }

        public static void createParallelStream_whenFindAnyResultIsPresent_thenCorrect() throws Exception {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
            Optional<Integer> result = list.stream().parallel().filter(num -> num < 4).findAny();
            System.out.println(result.isPresent());
        }

        public static void createStream_whenFindFirstResultIsPresent_thenCorrect() {

            List<String> list = Arrays.asList("A", "B", "C", "D");

            Optional<String> result = list.stream().findFirst();
            System.out.println(result.isPresent());

        }
    }

}
