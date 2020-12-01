package streamApiTest;

import java.util.stream.DoubleStream;

//Преобразует примитивный стрим в объектный.

public class StreamBoxed {
    public void testBoxed () {
        DoubleStream.of(0.1, Math.PI)
                .boxed()
                .map(Object::getClass)
                .forEach(System.out::println);
    }
}
