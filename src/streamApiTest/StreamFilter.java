package streamApiTest;

import java.util.stream.Stream;

public class StreamFilter {

    public void filterTest() {
        Stream.of(120, 135, 987, 456, 13, 48)
                .filter(x -> x > 100)
                .forEach(System.out::println);
    }

    public void filterTestFail() {
        Stream.of(1,2,3,4,5)
                .filter(x -> x==10)
                .forEach(System.out::println);
        //Нет вывода т.к. не соответствует условиям фильтра
    }


}
