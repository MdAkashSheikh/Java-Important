class Casio{
    int num1;
    int num2;
    String operations;

    public Casio(){
        num1 = 0;
        num2 = 0;
        operations = "Nothing";
    }
    public Casio(int i) {
        num1 = i;
        num2 = 0;
        operations = "Nothing";
    }
    public Casio(int i, int j) {
        num1 = i;
        num2 = j;
        operations = "Nothing";
    }

    public Casio(int i, int j, String st) {
        num1 = i;
        num2 = j;
        operations = st;
    }
}

public class JavaTutorial1 {
    public static void main(String[] args) {
        Casio obj1 = new Casio(4, 7);

        System.out.println(obj1.num1 + obj1.num2);
        System.out.println(obj1.operations);


    }
}
