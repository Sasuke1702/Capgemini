class Test
{
    int i;
    static int j;
    Test()
    {
        i=i+1;
        j=j+1;
    }
    void show()
    {
        System.out.println(i);
        System.out.println(j);
    }

}

public class InscanceAndStaticVarible
{
    public static void main(String[]args)
    {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        t1.show();
        t2.show();
        t3.show();
    }
}
// beacuse of static value of j (it only print last value )the output is 1 3 1 3 1 3
