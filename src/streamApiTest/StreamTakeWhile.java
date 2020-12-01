package streamApiTest;

import java.util.stream.Stream;

public class StreamTakeWhile {
    public void testTakeWhile() {
        Stream.of(1,2,3,4,2,4,1,3,3,3)
                .takeWhile(x-> x <= 3)
                .forEach(System.out::println);
    }
}
