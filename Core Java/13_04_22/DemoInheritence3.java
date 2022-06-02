class X
{
    int i;
    X()
    {
        i=10;
        System.out.println("In A/X");
    }
}
class Y extends X
{
    int i;
    Y()
    {
        i=20;
        System.out.println("In B/Y");
    }
    void add()
    {
        System.out.println(super.i+i);
    }
}

public class DemoInheritence3
{
    public static void main(String[]args)
    {
        Y ob = new Y();
        ob.add();
    }
}
