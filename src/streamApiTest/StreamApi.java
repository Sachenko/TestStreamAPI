package streamApiTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamApi {

    public static void TestList() {
        List<String> listTest = new ArrayList<>();
        listTest.add("One");
        listTest.add("Two");
        listTest.add("Three");
        listTest.add("Four");
        listTest.add("Five");
        listTest.add("Six");
        listTest.add("Seven");
        listTest.add("Eight");
        listTest.add("Nine");
        listTest.add("Ten");
        Stream<String> stream = listTest.stream();
        stream.filter(x-> x.length() == 3).forEach(System.out::println);
       /* Стрим можно вызывать только единожды.
       * Stream stream1 = listTest.stream(); */
        /*stream1.filter(x-> x.toString().length() == 4).forEach(System.out::println);*/
    }
//Пример выполнения потока
    public void testStream() {
        IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10)
                .limit(3).forEach(System.out::println);
    }
//Пример выполнения метода без потока
    public void testWithOutStream() {
        int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
        int count = 0;
        for (int x : arr) {
            if (x >= 90) continue;
            x += 10;
            count++;
            if (count > 3) break;
            System.out.print(x);
        }
    }

    public void testArrStream () {
        String[] arrayString = {"apple", "cup", "tea"};
        Stream<String> streamArr = Arrays.stream(arrayString);
        streamArr.map(s->s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        // streamOfArray.map(s->s.split("")) Преобразование слова в массив букв
        // .flatMap(Arrays::stream).distinct() выравнивает каждый сгенерированный поток в один поток/ дистинкт убирает дубли
    }




    public static void main(String[] args) {
        StreamApi streamApi = new StreamApi();

      streamApi.testArrStream();




    }
}

