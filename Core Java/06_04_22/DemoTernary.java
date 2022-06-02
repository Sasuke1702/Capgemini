import java.util.Scanner;

public class DemoTernary
{
    public static void main(String args[])
    {

        int a,b,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        a=sc.nextInt();
        b=sc.nextInt();
       // if(a>b)
        //{
          //  max=a;
       // }
        //else
        //{
         //   max=b;
        //}
        max=a>b?a:b;
        System.out.println("Maxium is "+max);
    }
}
