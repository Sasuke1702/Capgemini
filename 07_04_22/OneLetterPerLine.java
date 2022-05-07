import java.util.Scanner;

public class OneLetterPerLine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1;
        System.out.println("Enter  word : ");
        s1=sc.next();
        int x=s1.length();
        char ch;

        for(int i=0;i<x;i++)
        {
            ch=s1.charAt(i);
            System.out.println(ch);
        }

    }
}

