package Telusko.Exceptions;

class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}


class A {
    public void show() throws ClassNotFoundException {
            Class.forName("Deom");
        
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        int nums[] = new int[5];

        try {
            j = 18/i;            
            if ( j == 20)
                throw new CustomException("Can't divide with zero");
        }catch(CustomException e) {
            j = 18/1;
            System.out.println("That is the default " + e);
        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("That is the default " + e);
        }catch(ArrayIndexOutOfBoundsException bound){
            System.out.println("Index is out of bounds");
        }catch(Exception e) {
            System.out.println("Something went wrong!!!");
        }

        System.out.println("Last line compiled, Great!!!");
    }
}
