package streamApiTest;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSorted {
    public void testSorted() {
        IntStream.range(0, 1000000000)
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }

    public void testErrorSortConCat() {
        IntStream.concat(
                IntStream.range(0,100000),
                IntStream.of(-1,-2))
        .sorted()
        .limit(3)
        .forEach(System.out::println);
    }

    public void testSorted2() {
        Stream.of(120,410,85,32,314,12)
                .sorted()
                .forEach(System.out::println);
    }

}
