package streamApiTest;

import java.util.stream.Stream;

public class StreamOfNullable {

    public void ofNull () {
        double rand =  Math.random();
        System.out.println(rand);

        String str = rand > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);
    }
    public void streamNull () {
        Stream.empty()
                .forEach(System.out::println);
        // Вывода нет
    }

}
