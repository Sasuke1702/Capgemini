import java.util.Scanner;
public class RuneOfIntegers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,i,j;
        System.out.println("Enter value range : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=n1;i<=n2;i=i+1)
        {
            System.out.println(i);

        }
    }


}
