package com.akash;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> values = new ArrayList<>();
        Set<Integer> numbers = new HashSet<>();

        values.add(5);
        values.add(8);
        values.add(878);
        values.add(54);

        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        System.out.println(values);
        System.out.println(numbers);
    }
}
