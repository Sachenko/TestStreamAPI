package streamApiTest;

import java.util.stream.IntStream;
import java.util.stream.Stream;
//Пропускает элементы до тех пор, пока они удовлетворяют условию
//затем возвращает оставшуюся часть стрима
//Если предикат вернул для первого элемента false
//то ни единого элемента не будет пропущено

//Оператор подобен skip, только работает по условию.


public class StreamDropWhile {
    public void testDropWhile() {
        Stream.of(1,2,3,4,2,5)
                .dropWhile(x -> x >= 3)
                .forEach(System.out::println);
    }

    public void testDropWhile2() {
        Stream.of(1,2,3,4,2,5)
                .dropWhile(x -> x  <=3)
                .forEach(System.out::println);
    }

    public void testDropWhile3() {
        IntStream.range(2,7)
                .dropWhile(x -> x < 5)
                .forEach(System.out::println);
    }

    public void testDropWhile4() {
        IntStream.of(1,3,2,0,5,4)
                .dropWhile(x -> x % 2 == 1 )
                .forEach(System.out::println);
        // 2, 0, 5, 6
    }

}


