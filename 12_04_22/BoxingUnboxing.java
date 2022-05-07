public class BoxingUnboxing
{
    public static void main(String[]args)
    {
        //boxing
        int x=102;
        Integer ob=new Integer(x);
        // unboxing
        int y;
        y=ob.intValue();
        //=================
        //auto boxing
        int p=104;
        Integer ob2=p;
        //auto unboxing
        int q;
        q=ob2;
        //=============
        System.out.println(x);
        System.out.println(y);
        System.out.println(p);
        System.out.println(q);
    }
}
