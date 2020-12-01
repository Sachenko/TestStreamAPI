package streamApiTest;

import java.util.stream.Stream;

public class IterateStream {
    public void testIterate() {
        Stream.iterate(2, x -> x + 6)
                .limit(6)
                .forEach(System.out::println);
// 2, 8, 14, 20, 26, 32
    }
    public void testIterate2() {
        Stream.iterate(1, x -> x * 2)
                .limit(6)
                .forEach(System.out::println);
    }

}
