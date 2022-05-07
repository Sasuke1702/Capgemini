import java.util.Scanner;
public class quadradic
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        double x;

        System.out.println("enter the value of x = ");
        x=sc.nextDouble();
        System.out.println("X = "+x);
        x=((3*(x*x))-(8*x)+(4));
        System.out.println("Value is "+ x);

    }
}

