class Testttt<T extends Number>
{
    T i;
    void set(T x)
    {
        i=x;
    }
    void show()
    {
        System.out.println(i);
        System.out.println(i.getClass().getName());
    }
}
public class DemoGenerics4
{
    public static void main(String[] args)
    {
        //   Testttt<String> t1=new Testttt<>();
        Testttt<Integer> t2=new Testttt<>();
        //   t1.set("Hello");
        t2.set(100);
        //   t1.show();
        t2.show();

    }
}
