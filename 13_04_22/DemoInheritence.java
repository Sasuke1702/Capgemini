class A //extends object by default
{
    void show()
    {
        System.out.println("In Base");
    }
}
class B extends A
{
    void disp()
    {
        System.out.println("In derived");
    }
}
public class DemoInheritence
{
    public static void main(String[]ages)
    {
        B ob=new B();
        ob.show();
        ob.disp();
    }
}
