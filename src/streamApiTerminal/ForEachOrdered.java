package streamApiTerminal;

import java.util.stream.IntStream;
//Используется для параллельных стримов
public class ForEachOrdered {
    public void testForEachOrdered() {
        IntStream.range(0,100000)
                .parallel()
                .filter(x -> x % 10000 == 0)
                .map(x -> x / 10000)
                .forEach(x -> System.out.format("%s ",x));
//                .forEach(System.out::println);
    }
}
