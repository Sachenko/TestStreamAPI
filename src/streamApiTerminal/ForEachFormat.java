package streamApiTerminal;



//Выполняет указанное действие для каждого элемента стрима.

import java.util.stream.Stream;

public class ForEachFormat {

    public void testForEach() {
        Stream.of(120,410,85,32,314,12)
                .forEach(x -> System.out.format("%s ",x));
    }
}
