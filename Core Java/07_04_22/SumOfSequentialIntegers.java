import java.util.Scanner;

public class SumOfSequentialIntegers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,sum=0,i,j;
        System.out.println("Enter value : ");
        n1=sc.nextInt();

        for(i=1;i<=n1;i=i+1)
        {
           sum=sum+i;


        }
        System.out.println(sum);
    }
}
