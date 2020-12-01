package streamApiTest;

import java.util.stream.Stream;

public class StreamIterateLikeFor {

    //iterate(T seed, Predicate hasNext, UnaryOperator f)
    public void streamFor() {
        Stream.iterate(2,x -> x < 25, x -> x + 6)
                .forEach(System.out::println);
    }

    public void streamForTest() {
        Stream.iterate(4, x -> x < 100, x -> x *4)
                .forEach(System.out::println);
    }

    public void notStreamFor() {
        int seed = 2;
        for (int i = seed; hasNext(i); i = f(i)) {
            System.out.println(i);
        }
    }

    private int f(int i) {
        return i + 6;
    }
    private boolean hasNext(int i) {
           return i < 25;
    }

}
