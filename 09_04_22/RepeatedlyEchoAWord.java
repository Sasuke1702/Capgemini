import java.util.Scanner;
//
public class RepeatedlyEchoAWord
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,sum=0,i,j;
        String s1;
        System.out.println("Enter a World : ");
        s1=sc.next();
        n1=s1.length(); //give the length of string

        for(i=1;i<=n1;i=i+1)
        {
            System.out.println(s1);


        }

    }
}

