package com.Repeat;

class Calc{
    int num1;
    int num2;
    int result;

    public void perform() {
        result = num1 + num2;
    }
}
public class Obj1 {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.num1 = 10;
        obj.num2 = 5;
        obj.perform();
        System.out.println(obj.result);
    }
}
