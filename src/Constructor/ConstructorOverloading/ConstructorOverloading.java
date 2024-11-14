package Constructor.ConstructorOverloading;

public class ConstructorOverloading {


    public ConstructorOverloading(double d)
    {
        this(10);
        System.out.println("double value is called");
    }

    public ConstructorOverloading(int i)
    {
        this();
        System.out.println("int value is called");
    }

    public ConstructorOverloading()
    {
        System.out.println("default constructor");
    }

    public static void main(String[] args)
    {
        ConstructorOverloading constructorOverloading = new ConstructorOverloading(12.3);
    }


}
