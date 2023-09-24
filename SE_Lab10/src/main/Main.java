package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[][] arr = {
                { 1, 2 },
                { 3, 4, 5, 6 },
                { 7, 8, 9 }
        };

        Integer[] flatArray = flattenStream(arr)
                .toArray(Integer[] ::new);
        System.out.println(Arrays.toString(flatArray));
    }

    public static Stream<Integer> flattenStream(Integer[][] arrays)
    {
        List<Integer> list = new ArrayList<>();
        for (Integer[] array : arrays) {
            Arrays.stream(array)
                    .forEach(list::add);
        }
        return list.stream();
    }
}