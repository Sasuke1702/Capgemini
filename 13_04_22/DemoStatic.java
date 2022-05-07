class Test
{
    int i;
    static int j ;
    Test()
    {
        i=i+1;
        j=j+1;
    }
    void disp()
    {
        System.out.println("Hello");
    }
    static void show()
    {
        // s.o.p(i); can not use non static
        System.out.println(j);
        Test ob2=new Test();
        ob2.disp();
    }
}
public class DemoStatic
{
    public static void main(String[]args)
    {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        Test.show();
    }
}
