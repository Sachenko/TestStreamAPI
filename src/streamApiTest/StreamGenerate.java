package streamApiTest;

import java.util.stream.Stream;

public class StreamGenerate {
    public void testGenerate () {
        Stream.generate(() -> 999)
                .limit(10)
                .forEach(System.out::println);
    }
}
