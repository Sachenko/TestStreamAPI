package streamApiTest;

import java.util.stream.Stream;

public class StreamConcat {
    public void concatTest() {
        Stream.concat(
                Stream.of(1,2,3),
                Stream.of(3,4,5,6))
                .forEach(System.out::println);

    }
}
