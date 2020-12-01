package streamApiTest;

import java.util.stream.Stream;

public class StreamSkip {
    public void testSkip() {
        Stream.of(5,10)
                .skip(40)
                .forEach(System.out::println);
    }

    public void testSkip2() {
        Stream.of(123, 1243, 654, 1356, 124, 46799)
                .skip(2)
                .forEach(System.out::println);
    }

}
