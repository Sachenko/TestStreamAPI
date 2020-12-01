package streamApiTest;

import java.util.stream.Stream;
//builder()
//Создаёт мутабельный объект для добавления элементов в стрим
//без использования какого-либо контейнера для этого.

public class StreamBuilder {
    public void builderTest() {
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for (int i = 2; i <= 8; i += 2) {
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::println);
    }
}
