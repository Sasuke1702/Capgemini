@FunctionalInterface
interface AA<T>
{
    T add(T x,T y);
}
public class DemoFunctionalInterface2
{
    public static void main(String[] args)
    {
        AA<Integer> ob=(x,y)->x+y;
        System.out.println(ob.add(200,300));
    }
}
