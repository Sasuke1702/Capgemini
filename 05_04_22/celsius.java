import java.util.Scanner;

public class celsius
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        double f,c;
        System.out.println("enter themperature fahrenheit");
        f=sc.nextDouble();
        c=(f-32)*5/9;
        System.out.println("converted celsius is "+ c);
    }

}

