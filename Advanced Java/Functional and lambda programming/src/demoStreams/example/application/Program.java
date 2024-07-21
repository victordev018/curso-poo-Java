package demoStreams.example.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        // modos de criação de stream

        // mode 1
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        // mode 2
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        // mode 3
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // mode 3 -> fibonacci sequence
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, x -> new Long[]{x[1], x[0]+x[1]}).map(x -> x[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }
}
