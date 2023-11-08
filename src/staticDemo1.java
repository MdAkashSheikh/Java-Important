class Emp1 {
    int eid;
    int salary;
    static String ceo;
    static {
        ceo = "AL-Amin";
    }
    public Emp1() {
        eid = 101;
        salary = 3000;
    }
    public void Show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class staticDemo1 {
    public static void main(String[] args) {
        Emp1 navin = new Emp1();


        Emp1 rahul = new Emp1();


        navin.Show();
        rahul.Show();

    }
}
