class AA
{
    AA()
    {
        System.out.println("In A");
    }
}
class BB extends AA
{
    BB()
    {
        System.out.println("In B");
    }
}
class CC extends BB
{
    CC()
    {
        System.out.println("In C");
    }
}
public class DemoInheritence2
{
    public static void main(String[]args)
    {
        CC ob=new CC();
    }
}
