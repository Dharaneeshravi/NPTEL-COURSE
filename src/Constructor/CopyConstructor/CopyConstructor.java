package Constructor.CopyConstructor;

public class CopyConstructor {

    int id;
    String name;

    public CopyConstructor(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public CopyConstructor(CopyConstructor obj1)
    {
        this.id=obj1.id;
        this.name=obj1.name;
    }

    public void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args)
    {
        CopyConstructor obj1=new CopyConstructor(1,"sam");
        obj1.display();;
        CopyConstructor obj2=new CopyConstructor(obj1);
        obj2.name="ravi";
        obj2.display();
    }
}
