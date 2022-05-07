import java.util.Scanner;

public class circle
{
    public static void main(String arg[])
    {
        double r,a;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius of circle");
        r=sc.nextDouble();

        a=3.14*r*r;
        System.out.println("Area of circle is "+a);

    }
}
