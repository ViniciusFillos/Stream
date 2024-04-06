package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4, 10, 7, 4);

        Stream<Integer> str1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(str1.toArray()));

        Stream<String> str2 = Stream.of("Pietra", "Vinicius", "Jorge", "Pedro");
        System.out.println(Arrays.toString(str2.toArray()));

        Stream<Integer> str3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(str3.limit(10).toArray()));

        Stream<Long> fibonnaci = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(fibonnaci.limit(20).toArray()));
    }
}
