//Generics passing 2 parameters or value
class Testt<T,V>
{
    T i;
    V j;
    Testt(T x,V y)
    {
        i=x;
        j=y;
    }
    void show()
    {
        System.out.println(i);
        System.out.println(i.getClass().getName());
        System.out.println(j);
        System.out.println(j.getClass().getName());
    }

}
public class DemoGenerics2
{

    public static void main(String[] args) {
        Testt<String,Integer> ob1=new Testt("Hello", 100);
        ob1.show();
    }

}
