package streamApiTest;

import java.util.stream.Stream;

public class StreamLimit {
    public void testLimit() {
        Stream.of(120,310,67,32,321,12,123,1234134656,1242346,3456,3455667)
                .limit(4)
//                .limit(1)
                .forEach(System.out::println);
    }
}
