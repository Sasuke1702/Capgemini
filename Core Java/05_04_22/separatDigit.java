import java.util.Scanner;

public class separatDigit
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter value of a ");
        a=sc.nextInt();
        b=a/10;
        c=a%10;
        a=b+c;
        System.out.println("separat digit addiction is "+a);


    }
}
