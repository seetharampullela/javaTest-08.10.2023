package Telusko.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student Age: " + age + ", name:" + name;
    }
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age) {
                return 1;
            }else {
                return -1;
            }
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // Comparator<Integer> com = new Comparator<Integer>() 
        // {
        //   public int compare(Integer i, Integer j)
        //   {
        //     if(i%10 > j%10) {
        //         return 1;
        //     }else {
        //         return -1;
        //     }
        //   }

        // };
        Comparator<Student> com = new Comparator<Student>() 
        {
          public int compare(Student i, Student j)
          {
            if(i.age > j.age) {
                return 1;
            }else {
                return -1;
            }
          }

        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Navin"));
        studs.add(new Student(12, "John"));
        studs.add(new Student(18, "Parul"));
        studs.add(new Student(20, "Kiran"));

        Collections.sort(studs);
        for(Student s: studs)
        System.out.println(s);
    }
}
