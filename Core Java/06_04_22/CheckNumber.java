import java.util.Scanner;
public class CheckNumber
{
    public static void main(String args[])
    {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");

        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("Number is positive");
        }
        else if (n<0)
        {
            System.out.println("Number is negative");
        }
        else if (n==0)
        {
            System.out.println("Number is zero");

        }
        else
        {
            System.out.println("invalid");
        }
    }

}
