package streamApiTerminal;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLongCount {
    public void testStreamLongCount() {
        long count = IntStream.range(0, 10)
                .flatMap(x -> IntStream.range(0, x))
                .count();
        System.out.println(count);
    }

    public void testPr() {
        int q = 10 % 2;

        System.out.println(q);
    }


    public void testCount() {
        System.out.println(
                Stream.of(0,2,9,13,5,11)
                        .map (x -> x * 2)
                        .filter(x -> x % 2 == 1)
                .count()
        );
    }
}
