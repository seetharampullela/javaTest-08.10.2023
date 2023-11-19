interface A {
    void show();
    void config();
}

interface X extends A{
    void run();
}

interface Y extends A{
    void runInY();
}


class B implements X,Y {
    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In Config");
    }

    public void run() {
        System.out.println("In Run");
    }

    @Override
    public void runInY() {
                System.out.println("In Y Run");

    }
}


public class DemoInterface {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        obj.show();
        
        B obj1;
        obj1 = new B();
        obj1.run();
        obj1.runInY();
    }
}