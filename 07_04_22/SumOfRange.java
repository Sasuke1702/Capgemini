import java.util.Scanner;

public class SumOfRange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,sum=0,n2,i,j;
        System.out.println("Enter low value : ");
        n1=sc.nextInt();
        System.out.println("Enter high value : ");
        n2=sc.nextInt();

        for(i=n1;i<=n2;i=i+1)
        {
            sum=sum+i;


        }
        System.out.println(sum);
    }
}
