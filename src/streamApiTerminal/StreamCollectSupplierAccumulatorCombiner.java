package streamApiTerminal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCollectSupplierAccumulatorCombiner {
/*    То же, что и collect(collector),
    только параметры разбиты для удобства.
    Если нужно быстро сделать какую-то операцию,
    нет нужды реализовывать интерфейс Collector,
    достаточно передать три лямбда-выражения.*/
    public List testCollect() {
        List<String> list = Stream.of("a", "b", "c", "d")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        return list;
        // list: ["a", "b", "c", "d"]

    }

}

