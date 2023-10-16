abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play Music...");
    }
}

class WagonR extends Car {
    public void drive() {
        System.out.println("Driving");
    }
}


class A {
    int age; 
    public void show() {
        System.out.println("in show");
    }
    class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

abstract class C {
    public abstract void show();
}

class D extends C {
    public void show() {
        System.out.println("in C Show");
    }
    
}


public class Demo {
    public static void main(String a[]) {
        // Car obj = new WagonR();
        // obj.drive();
        // obj.playMusic();
        A obj = new A()
        { // anonymous inner class as it does not have name
            public void show() {
                System.out.println("Show in inner anon.");
            }
        };
        obj.show();

        A.B obj1 = obj.new B();
        // A.B obj1 = new A.B();
        obj1.config();

        C obj2 = new C()
        {
            public void show() {
                System.out.println("Show in New anon.");
            }

        };

        obj2.show();
        
    }
}