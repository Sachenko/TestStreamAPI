package streamApiTest;

import java.util.stream.Stream;
//Выполняет действие над каждым элементом стрима
//и при этом возвращает стрим с элементами исходного стрима.
//Служит для того,
// чтобы передать элемент куда-нибудь,
// не разрывая при этом цепочку операторов

public class StreamPeek {
    public void testPeek() {
        Stream.of(2,3,1,2,1)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct:  %d%n", x))
                .map (x -> x*x)
                .forEach(x -> System.out.format("after map: %d%n", x));
    }
}
