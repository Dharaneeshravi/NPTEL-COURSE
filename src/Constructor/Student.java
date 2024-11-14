package Constructor;

/*
    A constructor in Java is a special method that is used to initialize objects.
    The constructor is called when an object of a class is created.
    The constructor has no return type
    The class name is constructor name
    The constructor can allow modifiers of public,private,protected,default
    The constructor cannot allow modifiers of final,static,synchronized
 */

public class Student {

    int roll;
    String name;

    public Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }

    public static void main(String[] args)
    {
        Student student1= new Student(1,"ravi");

        System.out.println(student1.roll +" "+student1.name);

        Student student2= new Student(2,"ram");

        System.out.println(student2.roll +" "+student2.name);
    }
}
