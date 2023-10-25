class Calculator {                  //  Super Class
    public int add(int i, int j) {
        return i+j;
    }
}

class CalcAdv extends Calculator {    //Sub Clas
    public int sub(int i, int j) {
        return i - j;
    }
}

class CalcVeryAdv extends CalcAdv{
    public int mul(int i, int j) {
        return i * j;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        CalcAdv obj1 = new CalcAdv();
        CalcVeryAdv obj2 = new CalcVeryAdv();

        System.out.println(obj2.add(54, 23));
        System.out.println(obj2.sub(45, 21));
        System.out.println(obj2.mul(12, 6));
    }
}
