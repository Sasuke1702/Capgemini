import java.util.Scanner;

public class WordsSeparatedByDots
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,sum=0,n2,i,j;
        String s1,s2;
        System.out.println("Enter first word : ");
        s1=sc.next();
        System.out.println("Enter Secound word : ");
        s2=sc.next();
        int x=30-(s1.length()+s2.length());
        System.out.print(s1);


        for(i=0;i<x;i++)
        {


            System.out.print(".");

        }
        System.out.print(s2);

    }
}
