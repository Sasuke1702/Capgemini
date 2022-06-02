class Testtt<T>
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
public class DemoGenerics3
{
    public static void main(String[] args)
    {
        Testtt<String> t1=new Testtt<>();
        Testtt<Integer> t2=new Testtt<>();
        t1.set("Hello");
        t2.set(100);
        t1.show();
        t2.show();
    }
}
