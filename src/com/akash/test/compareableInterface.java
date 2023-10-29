package com.akash.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Stud{
    int rollno, marks;
    String name;
    public Stud(int rollno, String name, int marks) {
        super();
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    public String toString() {
        return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
    }
}
public class compareableInterface {
    public static void main(String[] args) {
        List<Stud> studs = new ArrayList<>();

        studs.add(new Stud(101, "Akash Sheikh", 99));
        studs.add(new Stud(102, "Rahim", 89));
        studs.add(new Stud(103, "Karim", 88));
        studs.add(new Stud(104, "Maha", 87));

        for (Stud s: studs) {
            System.out.println(s);
        }
    }
}
