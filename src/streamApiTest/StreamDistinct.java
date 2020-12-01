package streamApiTest;

import java.util.stream.Stream;

public class StreamDistinct {
    public void testDistinct() {
        Stream.of(2,1,1,8,45,2,3,12)
                .distinct()
                .forEach(System.out::println);
    }

}
