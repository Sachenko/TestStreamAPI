package streamApiTest;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//Как и в случае с map, служат для преобразования в примитивный стрим.

public class StreamFlatMap {
    public void testFlatMap(){
        Stream.of(2,3,0,1,4,6)
                .flatMapToInt(x -> IntStream.rangeClosed(0,x))
                .forEach(System.out::println);
    }

}
