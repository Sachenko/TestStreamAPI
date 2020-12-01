package streamApiTerminal;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//можно собрать все элементы в список
//можно собрать множество или другую коллекцию
//можно сгруппировать элементы по какому-нибудь критерию
//можно объединить всё в строку и т.д..

public class StreamCollect {

    public List testCollector() {
        List<Integer> list = Stream.of(1,2,3)
                .collect(Collectors.toList());
        return list;
    }

    public String StringCollect() {
        String s = IntStream.range(1,10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("-","<",">"));
        return s;
    }
}
