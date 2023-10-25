class AB {                       //Super Class
    public void show() {
        System.out.println("In A");
    }
}

class BC extends AB {             //Sub Class
    public void show() {
        super.show();
        System.out.println("In B");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        BC obj1 = new BC();
        obj1.show();
    }
}
