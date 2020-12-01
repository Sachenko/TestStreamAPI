package streamApiTest;

/*
 IntStream.range​(int startInclusive, int endExclusive)
 LongStream.range​(long startInclusive, long endExclusive)
 Создаёт стрим из числового промежутка [start..end),
 то есть от start (включительно) по end.
 */

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamRange {
    public void testRangeInt() {
        IntStream.range(0,10)
                .forEach(System.out::println);
    }

    public void testRangeIntClose(){
        IntStream.rangeClosed(0,10)
                .forEach(System.out::println);
    }

    public void testRangeLong() {
        LongStream.range(-10L, -5L)
                .forEach(System.out::println);
    }

    public void testRangeLongClose() {
        LongStream.rangeClosed(-8L, -5L)
                .forEach(System.out::println);
    }



}
