package streamApiTest;


import java.util.Arrays;
import java.util.stream.Stream;

public class StreamForOne {
    public void oneStream () {
        Arrays.asList(1,2,3,4).stream()
                .forEach(System.out::println);
    }

    public void streamOne () {
        Stream.of(1,2,3,4)
                .forEach(System.out::println);
    }


}
