public class DemoInterface {
    public static void main(String[] args) {
        Ab obj = new Bb();
        obj.configg();
    }
}

interface Ab {
    void showw();
    void configg();
}

interface Cb extends Ab {
    public default void showC(){
        System.out.print("Show in C");
    };
    void cofigc();
}

class Bb implements Ab {
    public void showw() {
        System.out.println("Show in Interface B");
    }
    public void configg() {
        System.out.println("Config in Interface B");
    }
}