package Telusko.Interfaces2;

// abstract class Computer { 
//     public abstract void code();
// }

//Interfaces helpst the code to make it loosely coupled by help of inheritance concept

interface Computer { 
    public abstract void code();
    default void msg(){
        System.out.println("Default Method");
    }
}

class Laptop implements Computer { // if the Computer class is an abstract class we have to extend Laptop
    //if it is interface,  it should use implement keyword
    public void code() {
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, compile, run : Faster");
    }
}

class Developer {
    public void devApp (Computer computer) {
        computer.code();
        computer.msg();
    }
}

public class DemoInterfaces2 {
    public static void main(String[] args) { 
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer pa1 = new Developer();
        pa1.devApp(desk);
    }
}
