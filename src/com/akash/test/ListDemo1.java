package com.akash.test;

import java.util.*;

public class ListDemo1 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(); //List is By default Mutable

        values.add(803);
        values.add(256);
        values.add(991);
        values.add(635);

        Collections.sort(values, (i, j) -> i%10 > j%10? 1 : -1);

        for (Object o: values) {
            System.out.println(o);
        }
    }
}
