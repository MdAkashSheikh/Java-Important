package com.akash.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(4);
        values.add(5);
        values.add(7);
        values.add(2, 6);

        Iterator it = values.iterator();

        System.out.println("Iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("ForLoop");

        for (int i = 0; i<values.size(); i++) {
            System.out.println(values.get(i));
        }
        System.out.println("Normal ForLoop");

        for (Object o : values) {
            System.out.println(o);
        }

    }
}
