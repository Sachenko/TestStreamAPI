package streamApiTest;

import java.util.stream.Stream;

public class StreamMap {
    public void mapTestString() {
        Stream.of("3","4","5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println);
    }

    public void testString () {
        String test = "10";
        int test2 =  Integer.parseInt(test);
        System.out.println(test2 + 1);
    }

    public void mapTest() {
        Stream.of(120, 410, 65, 6856, 4564, 12)
                .map(x -> x + 11)
                .forEach(System.out::println);
    }

}
