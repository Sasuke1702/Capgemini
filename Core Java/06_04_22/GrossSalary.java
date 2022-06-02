import java.util.Scanner;
public class GrossSalary
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        double bs,gs, hra, da;
        System.out.println("Enter basic salary of an employee");
        bs=sc.nextDouble();
        if (bs<=10000)
        {
            hra = bs * 0.20;
            da = bs * 0.80;
            gs = hra + da + bs;
            System.out.println("Gross salary = " + gs);
        }
        else if (bs<20000)
        {
            hra = bs * 0.25;
            da = bs * 0.90;
            gs = hra + da + bs;
            System.out.println("Gross salary = " + gs);
        }
        else if (bs>=20000)
        {
            hra = bs * 0.30;
            da = bs * 0.95;
            gs = hra + da + bs;
            System.out.println("Gross salary = " + gs);
        }
        else
        {
            System.out.println("please enter valid amount");
        }


    }
}
