//final block
import java.io.FileInputStream;
class FinalBlock
{
    static void div()
    {
        try{
            int a;
            a=10/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not divide by zero");
        }
        finally {

                System.out.println("Always Executed");

        }
    }
    static void div2()
    {
        try{
            int a;
            a=10/2;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not divide by zero");
        }
        finally {

            System.out.println("Always Executed");

        }
    }
    static void div3()
    {
        try{
            return;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not divide by zero");
        }
        finally {

            System.out.println("Always Executed");

        }
    }
    public static void main(String[]args)
    {
        //div2();
        //div1();
        div3();
    }
}

