//Encapsulation -> Binding data with Method
class Student {
    private int roll;
    private String name;

    //Getters and Setters

    public void setRoll(int roll) {
        this.roll = roll;
        System.out.println("Value of Roll Change");
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("Value of Name Change");
    }
    public int getRoll() {
        System.out.println("User is accessing the Roll");
        return roll;
    }

    public String getName() {
        System.out.println("User is accessing Name");
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setRoll(2);
        s1.setName("Nabin");
        System.out.println(s1.getRoll());
        System.out.println(s1.getName());
    }
}