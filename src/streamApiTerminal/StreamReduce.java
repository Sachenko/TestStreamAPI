package streamApiTerminal;

import java.util.stream.Stream;

public class StreamReduce {
//Позволяет преобразовать все элементы стрима в один объект.
//Например, посчитать сумму всех элементов, либо найти минимальный элемент.

    public int testReduce() {

        /*Сперва берётся объект identity и первый элемент стрима,
         применяется функция accumulator и identity становится её результатом.
         Затем всё продолжается для остальных элементов.*/

        int sum = Stream.of(1,2,3,4,5)
                .reduce(0,(acc, x) -> acc + x);
        return sum;
    }


}
