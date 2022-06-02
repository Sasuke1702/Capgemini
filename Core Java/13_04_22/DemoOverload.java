class Over
{
    void add(int x,int y)
    {
        System.out.println("Int Addition");
        System.out.println(x+y);
    }
    void add(float x, float y)
    {
        System.out.println("Float Addition");
        System.out.println(x+y);
    }
}
public class DemoOverload
{
    public static void main(String[]args)
    {
        Over t1=new Over();
        t1.add(1.2f,2.3f);
        t1.add(100,200);
    }
}
