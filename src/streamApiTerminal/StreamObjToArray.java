package streamApiTerminal;

import java.util.stream.Stream;

public class StreamObjToArray {
    //Возвращает нетипизированный массив с элементами стрима.
    public void testObjToArray() {
        String[] elements = Stream.of("a", "b", "c", "d")
                .toArray(String[]::new);
    }
}
