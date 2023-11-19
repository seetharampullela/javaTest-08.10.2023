package Telusko.Annotations;


@FunctionalInterface // which has only one method
interface A {
    void showTheDataWhichBelongsToThisClass();
}

class B implements A 
{
    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}
public class AnnotationDemo {
    public static void main(String[] a)
    {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
