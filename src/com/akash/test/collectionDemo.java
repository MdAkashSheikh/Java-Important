package com.akash.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionDemo {
    public static void main(String[] args) {
        Collection values = new ArrayList();

        values.add(4);
        values.add(5);
        values.add(2);

        Iterator it = values.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
