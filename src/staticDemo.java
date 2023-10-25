class Emp {
    int eid;
    int salary;
    static String ceo;

    public void emp() {
        eid = 1;
        salary = 3000;
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}
public class staticDemo {
    public static void main(String[] args) {
        Emp navin = new Emp();
        Emp rahul = new Emp();

        navin.eid = 1;
        navin.salary = 4000;
        Emp.ceo = "Mohasin";

        rahul.eid = 9;
        rahul.salary = 5000;
        Emp.ceo = "Mohasin";

        Emp.ceo = "Nikita";

        navin.show();
        rahul.show();
    }
}
